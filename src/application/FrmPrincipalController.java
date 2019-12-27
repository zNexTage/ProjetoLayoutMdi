package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;



public class FrmPrincipalController implements Initializable {
	
	//Declaração dos componentes
	@FXML
    private AnchorPane apMenuDireito;

    @FXML
    private AnchorPane apMenuEsquerdo;

    @FXML
    private AnchorPane apPrincipal;

    @FXML
    private Button btnMdi2;

    @FXML
    private Button btnMdi1;

    @FXML
    private ImageView imgLogotipo;
	    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
    	
    	//Mantem o tamanho do botão igual ao do anchor
		btnMdi1.prefWidthProperty().bind(apMenuEsquerdo.widthProperty());
		btnMdi2.prefWidthProperty().bind(apMenuEsquerdo.widthProperty());
	}
    
    /**
     * Abre o formulario mdi1 dentro do principal
     * @param event
     * @throws IOException
     */
    @FXML
	void btnMdi1_click(ActionEvent event) throws IOException 
	{
		AnchorPane apFrmMdi1 = (AnchorPane)FXMLLoader.load(this.getClass().getResource("FrmMdi1.fxml"));
		
		/********DEIXA O ANCHOR PANE ANCORADO******************/
		ancorarAnchorPane(apFrmMdi1, 0.0,0.0,0.0,0.0);
		/*****************************************************/
		apMenuDireito.getChildren().setAll(apFrmMdi1);		
	}
    
    /**
     * Abre o formulario mdi2 dentro do principal
     * @param event
     * @throws IOException
     */
    @FXML
    void btnMdi2_click(ActionEvent event) throws IOException 
    {
    	AnchorPane apFrmMdi2 = (AnchorPane)FXMLLoader.load(this.getClass().getResource("FrmMdi2.fxml"));
    	/********DEIXA O ANCHOR PANE ANCORADO******************/
    	ancorarAnchorPane(apFrmMdi2, 0.0,0.0,0.0,0.0);
    	/*****************************************************/
		apMenuDireito.getChildren().setAll(apFrmMdi2);		
    }
    
    /**
     * Ancora um anchorpane 
     * @param anchor
     * @param dLeft
     * @param dTop
     * @param dRight
     * @param dBottom
     */
    private void ancorarAnchorPane(AnchorPane anchor, Double dLeft, Double dTop, Double dRight, Double dBottom) 
    {
    	AnchorPane.setTopAnchor(anchor, dTop);
		AnchorPane.setLeftAnchor(anchor, dLeft);
		AnchorPane.setRightAnchor(anchor, dRight);
		AnchorPane.setBottomAnchor(anchor, dBottom);
    }

	
}
