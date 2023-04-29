package com.finall;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ImageConverterApp extends Application implements ImageApp{

    private ImageView imageView;
    private Label typeLabel;
    private Label lWidth;
    private Label lHeight;
    private Label resolutionLabel;

    public ImageConverterApp() {
        imageView = new ImageView();
        typeLabel = new Label();
        lWidth = new Label();
        lHeight = new Label();
        resolutionLabel = new Label();
    }
    @Override
    public void start(Stage primaryStage) {
        // UI controls
        Button openButton = new Button("Open Image");
        Button convertButton = new Button("Download Image");
        ChoiceBox<String> formatChoiceBox = new ChoiceBox<>();
        formatChoiceBox.getItems().addAll("JPEG", "BMP", "PNG");
        formatChoiceBox.setValue("JPEG");
        TextField filenameTextField = new TextField();
        filenameTextField.setEditable(false);

        // Label color and background
        openButton.setStyle("-fx-text-fill: white; -fx-background-color: pink");
        convertButton.setStyle("-fx-text-fill: white; -fx-background-color: pink");
        formatChoiceBox.setStyle("-fx-text-fill: white; -fx-background-color: pink");
        formatChoiceBox.setStyle("-fx-text-fill: white; -fx-background-color: pink");

        // Open Picture Button Event handlers
        openButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All Files", "*.*"),
                    new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.bmp")
            );
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                try {
                    Image image = new Image(selectedFile.toURI().toURL().toString());
                    Double width = image.getWidth();
                    Double height = image.getHeight();
                    imageView.setImage(image);
                    imageView.setFitWidth(100);
                    imageView.setFitHeight(100);
                    imageView.setSmooth(false);
                    filenameTextField.setText(selectedFile.getName());
                    typeLabel.setText("Type: " + getImageType(image));
                    lWidth.setText("Width: " + width);
                    lHeight.setText("Height: " + height);
                    resolutionLabel.setText("Resolution: " + width + " x " + height);
                    System.out.println("type: " + getImageType(image) + "width: " + width + "height: " + height  + "resolution: " + width + "x" + height);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Download Button Event handlers
        convertButton.setOnAction(e -> {
            Image image = imageView.getImage();
            String format = formatChoiceBox.getValue();
            String filename = filenameTextField.getText();
            int lastIndex = filename.lastIndexOf(".");
            if (lastIndex != -1) {
                filename = filename.substring(0, lastIndex);
            }
            filename += "." + format.toLowerCase();
            File outputFile = new File(filename);
            try {
                ImageIO.write(SwingFXUtils.fromFXImage(image, null), format, outputFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // Grid Layout
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        gridPane.add(filenameTextField, 0, 0);
        gridPane.add(openButton, 1, 0);
        gridPane.add(imageView, 0, 1, 2, 1);
        gridPane.add(typeLabel, 0, 2);
        gridPane.add(lWidth, 0, 3);
        gridPane.add(lHeight, 0, 4);
        gridPane.add(resolutionLabel, 0, 5);
        gridPane.add(new Label("Image Format:"), 0, 6);
        gridPane.add(formatChoiceBox, 0, 7);
        gridPane.add(convertButton, 0, 8);

        // Create Scene
        Scene scene = new Scene(gridPane, 389, 345);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Lowercase to uppercase
     * @param image
     * @return
     */
    @Override
    public String getImageType(Image image) {
        String url = image.impl_getUrl().toLowerCase();
        if (url.endsWith(".png")) {
            return "PNG";
        } else if (Arrays.asList(".jpg", ".jpeg").contains(url.substring(url.lastIndexOf(".")))) {
            return "JPEG";
        } else if (url.endsWith(".bmp")) {
            return "BMP";
        } else {
            return "Unknown";
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
