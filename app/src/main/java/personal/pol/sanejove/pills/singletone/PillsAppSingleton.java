package personal.pol.sanejove.pills.singletone;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import personal.pol.sanejove.pills.entities.Day;

public class PillsAppSingleton extends AppCompatActivity {

    private ArrayList<Day> dayArrayList;
    private int currentPosition;
    private Context context;

    private static class SingletonInstance {
        private static PillsAppSingleton INSTANCE = new PillsAppSingleton();
    }

    public static PillsAppSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private PillsAppSingleton() {
        //Constructor Singleton

    }
}
