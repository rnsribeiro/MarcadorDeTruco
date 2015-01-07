package rnsribeiro.com.marcadordetruco;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;


public class MarcadorTruco extends Activity {

    public int pontoNos = 0;
    public int pontoEles = 0;
    public int nosPartidas = 0;
    public int elesPartidas = 0;
    public int melhor5Nos = 0;
    public int melhor5Eles = 0;
    public TextView txtNos;
    public TextView txtEles;
    public TextView txtNosPartidas;
    public TextView txtElesPartidas;
    public RadioButton radioNos1;
    public RadioButton radioNos2;
    public RadioButton radioNos3;
    public RadioButton radioEles1;
    public RadioButton radioEles2;
    public RadioButton radioEles3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inicializar();
    }

    public void inicializar(){
        setContentView(R.layout.activity_main);

        pontoNos = 0;
        pontoEles = 0;
        nosPartidas = 0;
        elesPartidas = 0;
        melhor5Nos = 0;
        melhor5Eles = 0;


        txtNos = (TextView)findViewById(R.id.txtNos);
        txtEles = (TextView)findViewById(R.id.txtEles);
        txtNosPartidas = (TextView)findViewById(R.id.txtNosPartidas);
        txtElesPartidas = (TextView)findViewById(R.id.txtElesPartidas);

        radioNos1 = (RadioButton)findViewById(R.id.radioNos1);
        radioNos2 = (RadioButton)findViewById(R.id.radioNos2);
        radioNos3 = (RadioButton)findViewById(R.id.radioNos3);

        radioEles1 = (RadioButton)findViewById(R.id.radioEles1);
        radioEles2 = (RadioButton)findViewById(R.id.radioEles2);
        radioEles3 = (RadioButton)findViewById(R.id.radioEles3);
    }

    public void desabilitarLayout(){
        LinearLayout layout1 = (LinearLayout)findViewById(R.id.layoutMenosMais1);
        for(int i = 0; i < layout1.getChildCount(); i++){
             View child = layout1.getChildAt(i);
             child.setEnabled(false);
        }

        LinearLayout layout2 = (LinearLayout)findViewById(R.id.layoutMenosMais3);
        for(int i = 0; i < layout2.getChildCount(); i++){
            View child = layout2.getChildAt(i);
            child.setEnabled(false);
        }

        LinearLayout layout3 = (LinearLayout)findViewById(R.id.layoutMenosMais6);
        for(int i = 0; i < layout3.getChildCount(); i++){
            View child = layout3.getChildAt(i);
            child.setEnabled(false);
        }

        LinearLayout layout4 = (LinearLayout)findViewById(R.id.layoutMenosMais9);
        for(int i = 0; i < layout4.getChildCount(); i++){
            View child = layout4.getChildAt(i);
            child.setEnabled(false);
        }

        LinearLayout layout5 = (LinearLayout)findViewById(R.id.layoutMenosMais12);
        for(int i = 0; i < layout5.getChildCount(); i++){
            View child = layout5.getChildAt(i);
            child.setEnabled(false);
        }

        LinearLayout layout6 = (LinearLayout)findViewById(R.id.layoutCheckBox);
        for(int i = 0; i < layout6.getChildCount(); i++){
            View child = layout6.getChildAt(i);
            child.setEnabled(false);
        }


    }

    // Botões para menos e mais 1
    public void cliqueNosMenos1(View view){
        if (pontoNos <= 0 ){
            pontoNos = 0;
        } else {
            pontoNos -= 1;
        }

        txtNos.setText(String.format("%02d", pontoNos));
        ganhador();
    }


    public void buttonNosMais1(View view){
        pontoNos++;
        txtNos.setText(String.format("%02d", pontoNos));
        ganhador();
    }

    public void buttonElesmais1(View view){
        pontoEles++;
        txtEles.setText(String.format("%02d", pontoEles));
        ganhador();
    }

    public void cliqueElesMenos1(View view){
        if (pontoEles <= 0){
            pontoEles = 0;
        } else {
            pontoEles -= 1;
        }

        txtEles.setText(String.format("%02d", pontoEles));

        ganhador();
    }
    // Fim botões para menos e mais 1

    public void cliqueNosMenos3(View view){
        if (pontoNos <= 3){
            pontoNos = 0;
        } else {
            pontoNos -= 3;
        }

        txtNos.setText(String.format("%02d", pontoNos));

        ganhador();
    }


    public void buttonNosMais3(View view){
        pontoNos+=3;
        txtNos.setText(String.format("%02d", pontoNos));

        ganhador();
    }

    public void buttonElesmais3(View view){
        pontoEles+=3;
        txtEles.setText(String.format("%02d", pontoEles));

        ganhador();
    }

    public void cliqueElesMenos3(View view){
        if (pontoEles <= 3){
            pontoEles = 0;
        } else {
            pontoEles -= 3;
        }

        txtEles.setText(String.format("%02d", pontoEles));

        ganhador();
    }
   /*fim pontos 3 */

    public void cliqueNosMenos6(View view){
        if (pontoNos <= 6){
            pontoNos = 0;
        } else {
            pontoNos -= 6;
        }

        txtNos.setText(String.format("%02d", pontoNos));

        ganhador();
    }


    public void buttonNosMais6(View view){
        pontoNos+=6;
        txtNos.setText(String.format("%02d", pontoNos));

        ganhador();
    }

    public void buttonElesmais6(View view){
        pontoEles+=6;
        txtEles.setText(String.format("%02d", pontoEles));

        ganhador();
    }

    public void cliqueElesMenos6(View view){
        if (pontoEles <= 6){
            pontoEles = 0;
        } else {
            pontoEles -= 6;
        }

        txtEles.setText(String.format("%02d", pontoEles));

        ganhador();
    }
    /*fim 6 pontos*/

    public void cliqueNosMenos9(View view){
        if (pontoNos <= 9){
            pontoNos = 0;
        } else {
            pontoNos -= 9;
        }

        txtNos.setText(String.format("%02d", pontoNos));

        ganhador();
    }


    public void buttonNosMais9(View view){
        pontoNos+=9;
        txtNos.setText(String.format("%02d", pontoNos));

        ganhador();
    }

    public void buttonElesmais9(View view){
        pontoEles+=9;
        txtEles.setText(String.format("%02d", pontoEles));

        ganhador();
    }

    public void cliqueElesMenos9(View view){
        if (pontoEles <= 9){
            pontoEles = 0;
        } else {
            pontoEles -= 9;
        }

        txtEles.setText(String.format("%02d", pontoEles));

        ganhador();
    }
    /*fim 9 pontos*/

    public void cliqueNosMenos12(View view){
        if (pontoNos <= 12){
            pontoNos = 0;
        } else {
            pontoNos -= 12;
        }

        txtNos.setText(String.format("%02d", pontoNos));

        ganhador();
    }


    public void buttonNosMais12(View view){
        pontoNos+=12;
        txtNos.setText(String.format("%02d", pontoNos));
        ganhador();
    }

    public void buttonElesmais12(View view){
        pontoEles+=12;
        txtEles.setText(String.format("%02d", pontoEles));
        ganhador();
    }

    public void cliqueElesMenos12(View view){
        if (pontoEles <= 12){
            pontoEles = 0;
        } else {
            pontoEles -= 12;
        }

        txtEles.setText(String.format("%02d", pontoEles));

        ganhador();
    }

    public void ganhador(){
        if(pontoNos >= 12){
            pontoNos = 0;
            pontoEles = 0;
            nosPartidas++;
            melhor5Nos++;

            if (melhor5Nos == 1){
                radioNos1.setChecked(true);
            }
            if (melhor5Nos == 2){
                radioNos1.setChecked(true);
                radioNos2.setChecked(true);
            }
            if (melhor5Nos == 3){
                radioNos1.setChecked(true);
                radioNos2.setChecked(true);
                radioNos3.setChecked(true);

                menssagemNovaRodada();
            }
            txtEles.setText(String.format("%02d", pontoEles));
            txtNos.setText(String.format("%02d", pontoNos));
            txtNosPartidas.setText(String.format("%02d", nosPartidas));
        }

        if (pontoEles >= 12){
            pontoEles = 0;
            pontoNos = 0;
            elesPartidas++;
            melhor5Eles++;


            if (melhor5Eles == 1){
                radioEles3.setChecked(true);
            } else if (melhor5Eles == 2){
                radioEles3.setChecked(true);
                radioEles2.setChecked(true);
            } else if (melhor5Eles == 3){
                radioEles3.setChecked(true);
                radioEles2.setChecked(true);
                radioEles1.setChecked(true);

                menssagemNovaRodada();
            }
            txtEles.setText(String.format("%02d", pontoEles));
            txtNos.setText(String.format("%02d", pontoNos));
            txtElesPartidas.setText(String.format("%02d", elesPartidas));

        }

    }

    public void menssagemNovaRodada(){
        AlertDialog.Builder menssagem = new AlertDialog.Builder(MarcadorTruco.this);
        menssagem.setMessage("Deseja jogar uma nova rodada?");
        menssagem.setCancelable(false);
        menssagem.setPositiveButton("Sim",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        melhor5Eles = 0;
                        melhor5Nos = 0;

                        pontoNos = 0;
                        pontoEles = 0;

                        radioNos1.setChecked(false);
                        radioNos2.setChecked(false);
                        radioNos3.setChecked(false);

                        radioEles1.setChecked(false);
                        radioEles2.setChecked(false);
                        radioEles3.setChecked(false);

                        txtNos.setText(String.format("%02d", pontoNos));
                        txtEles.setText(String.format("%02d", pontoEles));
                    }
                });
        menssagem.setNegativeButton("Não",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        melhor5Eles = 0;
                        melhor5Nos = 0;
                        desabilitarLayout();
                        dialog.cancel();
                    }
                });

        AlertDialog exibirMenssagem = menssagem.create();
        exibirMenssagem.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_marcador_truco, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.limparPontuacao) {
            inicializar();
        }
        if (id == R.id.sairDoMarcador){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
