package org.paul.sudoku;

import android.app.Activity;
import android.os.Bundle;

public class Sudoku extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        TextView tv = new TextView(this);
        tv.setText("If you hold a cat by the tail you learn things you cannot learn any other way.");
        setContentView(tv);
         */
        
        setContentView(R.layout.main);    
    
    }
}