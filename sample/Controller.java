package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static java.lang.Integer.parseInt;

public class Controller {
    @FXML
    private Button close_btn;

    @FXML
    private Button food_q_btn;

    @FXML
    private Button cal_cal_btn;

    @FXML
    private Button amn_cal_btn;

    @FXML
    private Text main_text;

    @FXML
    private TextField fq_search21;

    @FXML
    private Button fq_find;

    @FXML
    private Text fq_result;

    @FXML
    private Text fq_ev_t;

    @FXML
    private Text fq_ev_v;

    @FXML
    private Text fq_fq_t;

    @FXML
    private Text fq_fq_v;

    @FXML
    private Text cal_cal_mt;

    @FXML
    private TextField cal_cal_ec;

    @FXML
    private TextField cal_cal_em;

    @FXML
    private Text cal_cal_res_t;

    @FXML
    private Text cal_cal_res_v;

    @FXML
    private Button cal_cal_calc;

    @FXML
    private Text am_cal_mt;

    @FXML
    private Button am_cal_find;

    @FXML
    private TextField am_cal_search;

    @FXML
    private Text am_cal_res_t;

    @FXML
    private Text am_cal_v;



@FXML
    public void initialize(){
        close_btn.setOnAction(actionEvent -> Platform.exit());

        food_q_btn.setOnAction(actionEvent -> {
            am_cal_mt.setVisible(false);
            am_cal_find.setVisible(false);
            am_cal_search.setVisible(false);
            am_cal_res_t.setVisible(false);
            am_cal_v.setVisible(false);
            cal_cal_mt.setVisible(false);
            cal_cal_calc.setVisible(false);
            cal_cal_ec.setVisible(false);
            cal_cal_em.setVisible(false);
            cal_cal_res_t.setVisible(false);
            cal_cal_res_v.setVisible(false);
            main_text.setVisible(false);
            fq_search21.setVisible(true);
            fq_result.setVisible(true);
            fq_ev_t.setVisible(true);
            fq_ev_v.setVisible(true);
            fq_fq_t.setVisible(true);
            fq_fq_v.setVisible(true);
            fq_find.setVisible(true);
            String a = "Apple";
            String f = "Fried Potatoes";
            fq_find.setOnAction(actionEvent1 -> {
                        if (a.equals(fq_search21.getText())){
                            fq_ev_v.setText("52 cal., 100 gr.");
                            fq_fq_v.setText("High");
                        }
                        if (f.equals(fq_search21.getText())){
                            fq_ev_v.setText("312 cal., 100 gr.");
                            fq_fq_v.setText("Low");
                        }
                    }
            );
    });

    cal_cal_btn.setOnAction(actionEvent -> {
        am_cal_mt.setVisible(false);
        am_cal_find.setVisible(false);
        am_cal_search.setVisible(false);
        am_cal_res_t.setVisible(false);
        am_cal_v.setVisible(false);
        fq_search21.setVisible(false);
        fq_result.setVisible(false);
        fq_ev_t.setVisible(false);
        fq_ev_v.setVisible(false);
        fq_fq_t.setVisible(false);
        fq_fq_v.setVisible(false);
        fq_find.setVisible(false);
        main_text.setVisible(false);
        cal_cal_mt.setVisible(true);
        cal_cal_calc.setVisible(true);
        cal_cal_ec.setVisible(true);
        cal_cal_em.setVisible(true);
        cal_cal_res_t.setVisible(true);
        cal_cal_res_v.setVisible(true);

        String cal_str = cal_cal_ec.getText();
        String mass_str = cal_cal_em.getText();

        int cal = parseInt(cal_str.trim());
        int mass = parseInt(mass_str.trim());
        int result = mass/100*cal;
        String fresult = String.valueOf(result);
        cal_cal_calc.setOnAction(actionEvent1 -> {
            System.out.println(fresult);
            cal_cal_res_v.setText(fresult);
                }
        );

        System.out.println("done");

    });

    amn_cal_btn.setOnAction(actionEvent -> {
        fq_search21.setVisible(false);
        fq_result.setVisible(false);
        fq_ev_t.setVisible(false);
        fq_ev_v.setVisible(false);
        fq_fq_t.setVisible(false);
        fq_fq_v.setVisible(false);
        fq_find.setVisible(false);
        cal_cal_mt.setVisible(false);
        cal_cal_calc.setVisible(false);
        cal_cal_ec.setVisible(false);
        cal_cal_em.setVisible(false);
        cal_cal_res_t.setVisible(false);
        cal_cal_res_v.setVisible(false);
        main_text.setVisible(false);
        am_cal_mt.setVisible(true);
        am_cal_find.setVisible(true);
        am_cal_search.setVisible(true);
        am_cal_res_t.setVisible(true);
        am_cal_v.setVisible(true);

        String a = "Salt";
        String f = "Sugar";
        am_cal_find.setOnAction(actionEvent1 -> {
                    if (a.equals(am_cal_search.getText())){
                        am_cal_v.setText("18 Grams of Salt = 1 tablespoon");
                    }
                    if (f.equals(am_cal_search.getText())){
                        am_cal_v.setText("13 Grams of Sugar = 1 tablespoon");
                    }
                }
        );

    });

    }

}
