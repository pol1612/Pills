package personal.pol.sanejove.pills.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import personal.pol.sanejove.pills.R;
import personal.pol.sanejove.pills.interfaces.ItemClickListener;
import personal.pol.sanejove.pills.singletone.PillsAppSingleton;


public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.recyclerView = findViewById(R.id.recView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        PillsAppSingleton.getInstance().setAppContext(this);
        PillsAppSingleton.getInstance().setPizzOrderArrayListToJSONFile();
        recyclerView.setAdapter(null); //TODO: add DayAdapter

    }
    @Override
    public void onClick(int position) {
        PillsAppSingleton.getInstance().setCurrentPosition(position);
        Intent i = new Intent(MainActivity.this, DayDetailsActivity.class);
        startActivity(i);
    }
    @Override
    protected void onResume() {
        super.onResume();
        PillsAppSingleton.getInstance().getPizzaOrderAdapter().notifyDataSetChanged();
        /**/
        //TODO implement ADD,UPDATE,DELETE from Singleton to save
    }
}
