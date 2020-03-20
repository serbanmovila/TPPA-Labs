package lab2.tppa.tppa2;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.TextView;
import android.telephony.SmsManager;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private static TextView tv;
    private static SearchView sv;
    private static Button button;
    private static String finaltv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textMain);
        sv = (SearchView)findViewById(R.id.searchView);

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Final");
                finaltv = tv.getText().toString();
            }
        });


        String[] laptops = new String[]{"HP", "Dell", "Asus", "Acer", "Lenovo", "Samsung", "MacBook", "Apple", "Xiaomi", "Razer"};
        ListView mainListView = (ListView) findViewById( R.id.list_view);
        ArrayList<String> arraylaptops = new ArrayList<String>();
        arraylaptops.addAll(Arrays.asList(laptops));
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listviewrows, arraylaptops);
        mainListView.setAdapter(adapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent = new Intent(MainActivity.this,LV1Activity.class);
                    startActivity(intent);
                }
                if(i==1)
                {
                    Intent intent = new Intent(MainActivity.this,LV2Activity.class);
                    startActivity(intent);
                }
                if(i==2)
                {
                    Intent intent = new Intent(MainActivity.this,LV3Activity.class);
                    startActivity(intent);
                }
                if(i==3)
                {
                    Intent intent = new Intent(MainActivity.this,LV4Activity.class);
                    startActivity(intent);
                }
                if(i==4)
                {
                    Intent intent = new Intent(MainActivity.this,LV5Activity.class);
                    startActivity(intent);
                }
                if(i==5)
                {
                    Intent intent = new Intent(MainActivity.this,LV6Activity.class);
                    startActivity(intent);
                }
                if(i==6)
                {
                    Intent intent = new Intent(MainActivity.this,LV7Activity.class);
                    startActivity(intent);
                }
                if(i==7)
                {
                    Intent intent = new Intent(MainActivity.this,LV8Activity.class);
                    startActivity(intent);
                }
                if(i==8)
                {
                    Intent intent = new Intent(MainActivity.this,LV9Activity.class);
                    startActivity(intent);
                }
                if(i==9)
                {
                    Intent intent = new Intent(MainActivity.this,LV10Activity.class);
                    startActivity(intent);
                }

            }
        });

        Log.i(TAG, "onCreate");
    }

//    public boolean checkPermission(String permission)
//    {
//        int check = ContextCompat.checkSelfPermission(this, permission);
//        return (check == getPackageManager().hasSystemFeature(PackageManager.PERMISSION_GRANTED)));
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        switch (item.getItemId()){
            case R.id.item1:
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.item2:
                intent = new Intent(MainActivity.this, LV1Activity.class);
                startActivity(intent);
                break;
            case R.id.item3:
                intent = new Intent(MainActivity.this, LV5Activity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onRestart(){
        super.onStart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        tv.setText(finaltv);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        tv.setText(finaltv);
    }
}
