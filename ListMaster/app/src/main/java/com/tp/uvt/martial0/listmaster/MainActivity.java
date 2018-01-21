package com.tp.uvt.martial0.listmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tp.uvt.martial0.listmaster.Master;

import static com.tp.uvt.martial0.listmaster.R.id.textView;



public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView1 = (ListView) findViewById(R.id.listView1);
       final TextView  textView= (TextView) findViewById(R.id.textView);

        Master[] items = {
                new Master(1, "MP2L", 25.50,"Master de developpement de logiciel libre"),
                new Master(2,"MPQSE", 19.50,"Mastère Professionnel en Management intégré"),
                new Master(3, "NT2R", 14.50," Mastère professionnel en NT Télécommunications et Réseaux"),
                new Master(4, "M2P2", 22.50,"Mastère professionnel en Préparation Mentale "),

        };

        ArrayAdapter<Master> adapter = new ArrayAdapter<Master>(this,
                android.R.layout.simple_list_item_1, items);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();


            }
        });

    }
}
