package com.example.myminiproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Account> accounts;
    private List<Question> questions;

    AccountAdapter(Context context, List<Account> accounts, List<Question> questions){
        this.accounts = accounts;
        this.questions = questions;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account account = accounts.get(position);
        Question question = questions.get(position);
        holder.name.setText(account.getName());
        holder.question.setText(question.getQuestion());
        holder.subject.setText(question.getSubject());
    }

    @Override
    public int getItemCount() {
        return accounts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView name, subject, question;
        //Button toQuestion;

        public ViewHolder(View view) {
            super(view);

            name = view.findViewById(R.id.nameText);
            subject = view.findViewById(R.id.subjectText);
            question = view.findViewById(R.id.questionText);
            //toQuestion = view.findViewById(R.id.toQuestion);
        }
    }
}
