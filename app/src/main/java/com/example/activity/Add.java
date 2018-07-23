package com.example.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


    public class Add extends AppCompatActivity  {
        public static final String EXTRA_MESSAGE = "com.example.activity.MESSAGE";
        EditText etname1, etname2, etname3;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_profile);
        }
        public void AddActivity(View view) {
            Intent intent = new Intent(this, Diary.class);//set intent Diary to be able to go from add class to diary class
            etname1 = (EditText) findViewById(R.id.etusername);//edit text of activity name by the user
            etname2 = (EditText) findViewById(R.id.etdescription);//edit text of activity name by the user
            etname3 = (EditText) findViewById(R.id.etdeadline);//edit text of activity name by the user
            String name1 = etname1.getText().toString();// activity name get text from edit text
            String name2 = etname2.getText().toString();// activity name get text from edit text
            String name3 = etname3.getText().toString();// activity name get text from edit text
            intent.putExtra(EXTRA_MESSAGE, name1);//set Textview in Diary class the name of the activity enterd by the user in the add class
            intent.putExtra(EXTRA_MESSAGE, name2);//set Textview in Diary class the name of the activity enterd by the user in the add class
            intent.putExtra(EXTRA_MESSAGE, name3);//set Textview in Diary class the name of the activity enterd by the user in the add class
            startActivity(intent);//Launch Diary page
        }

        public void PreviousPage (View view) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }//Go to previous page
 }//end




