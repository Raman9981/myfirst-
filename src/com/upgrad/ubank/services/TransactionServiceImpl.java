package com.upgrad.ubank.services;

import com.upgrad.ubank.dtos.Transaction;

public class TransactionServiceImpl implements TransactionService{

    Transaction transactions[]= new Transaction[100];

    int counter=0;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        this.transactions[counter] = transaction;
        this.counter++;
        return transaction;

    }

    @Override
    public Transaction[] getTransactions(int accountNo) {
        Transaction transactions2[] = new Transaction[transactions.length];
        int j=0;
        for(int i=0;i<counter;i++){
            if(this.transactions[i].getAccountNo() == accountNo){
                transactions2[j]=this.transactions[i];
                j++;
            }
        }

        return transactions2;

    }
}
