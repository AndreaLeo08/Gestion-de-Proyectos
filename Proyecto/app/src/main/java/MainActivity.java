import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity {

    EditText myInput;
    TextView myText;
    MyDBHandler dbHandler;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInput = (EditText) findViewById(R.id.edTxtObjeto);
        myText = (TextView) findViewById(R.id.textViewObjeto);

        dbHandler = new MyDBHandler(this,null,null,1);
        printDataBase();

    }

    public void printDataBase(){

        String dbString = dbHandler.databaseaString();
        myText.setText(dbString);
        myInput.setText("");

    }



    public void btnAñadirObjetoClick(View view){

        Objeto Objeto = new Objeto(myInput.getText().toString());
        dbHandler.addObjet(objeto);
        printDataBase();

    }


    public void btnEliminaObjetoClick(View view){

        String inputText = myInput.getText().toString();
        dbHandler.deleteObjet(inputText);
        printDataBase();

    }

}
