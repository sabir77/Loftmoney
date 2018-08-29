package com.sabirchik.loftmoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {



    private EditText nameInput ;
    private EditText priceInput;
    private Button addBtn ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        nameInput = findViewById(R.id.name);
        priceInput = findViewById(R.id.price);
        addBtn = findViewById(R.id.add_btn);

        nameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void afterTextChanged(Editable editable) {

                if (! TextUtils.isEmpty(editable)){
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_add);


                    nameInput = findViewById(R.id.name);
                    priceInput = findViewById(R.id.price);
                    addBtn = findViewById(R.id."@+id/add_btn");

                    nameInput.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

                        @Override
                        public void afterTextChanged(Editable editable) {

                            if (! TextUtils.isEmpty(editable))
                                addBtn.setEnabled(true);
                            else
                                addBtn.setEnabled(false);

                        }
                    });
                }
                    addBtn.setEnabled(true);
                else
                    addBtn.setEnabled(false);

                addBtn.setEnabled(! TextUtils.isEmpty(editable));


                    }
                });
            }
        });
    }
}