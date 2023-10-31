module EjerciciosJFX_ActividadR {
	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires java.desktop;
	requires javafx.web;
	requires javafx.fxml;
	requires javafx.swing;
	requires javafx.media;
	requires javafx.graphics;
	requires EjerciciosJFX_ActividadQ;
	
	opens application to javafx.graphics, javafx.fxml, EjerciciosJFX_ActividadQ;
	opens controller to javafx.graphics, javafx.fxml, EjerciciosJFX_ActividadQ;
}
