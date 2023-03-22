package com.example.myminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AccountsList extends AppCompatActivity {
    private RecyclerView AccountsList;
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Question> questions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts_list);
        initializeData();
        AccountsList = findViewById(R.id.AccountsList);
        AccountAdapter accountAdapter = new AccountAdapter(this, accounts, questions);
        AccountsList.setLayoutManager(new LinearLayoutManager(this));
        AccountsList.setAdapter(accountAdapter);
    }

    private void initializeData(){
        accounts.add(new Account("John"));
        questions.add(new Question("Cooking", "How cook a pie?"));
        accounts.add(new Account("Tom"));
        questions.add(new Question("Geography", "Where is Armenia?"));
        accounts.add(new Account("Andrew"));
        questions.add(new Question("Samsung", "Shall I leave Samsung?"));
        accounts.add(new Account("Nikitos"));
        questions.add(new Question("Game", "Is Hades top?"));
        accounts.add(new Account("Max"));
        questions.add(new Question("Cooking", "How cook a chicken soup?"));
        accounts.add(new Account("Robert"));
        questions.add(new Question("Exams", "Are you planning to take exams?"));
        accounts.add(new Account("Christopher"));
        questions.add(new Question("Meet", "Don't you want to see me?"));
        accounts.add(new Account("Manuel"));
        questions.add(new Question("LMAO", "What for?"));
        accounts.add(new Account("Miguel"));
        questions.add(new Question("Drink", "HAre we going to drink today?"));
        accounts.add(new Account("John"));
        questions.add(new Question("LMAO", "What's it?"));
        accounts.add(new Account("Sean"));
        questions.add(new Question("Exams", "You didn't make it, did you?"));
        accounts.add(new Account("Andy"));
        questions.add(new Question("LMAO", "What the...?"));
        accounts.add(new Account("Robert"));
        questions.add(new Question("Fruits", "Do you like tangerines?"));
        accounts.add(new Account("Raul"));
        questions.add(new Question("HomeWork", "Did you do your homework?"));
        accounts.add(new Account("Donald"));
        questions.add(new Question("Ignor", "Why are you ignoring me?"));
    }
}