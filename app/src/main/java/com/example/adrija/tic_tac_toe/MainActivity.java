package com.example.adrija.tic_tac_toe;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    int turn;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b10=(Button)findViewById(R.id.b10);


         turn=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                            turn = 2;
                        b1.setText("X");
                        b1.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        b1.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                        b2.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        b2.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                        b3.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        b3.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                        b4.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        b4.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                        b5.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        b5.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                        b6.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        b6.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                        b7.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        b7.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                        b8.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        b8.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().equals("")) {
                    count=count+1;
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                        b9.setTextColor(Color.parseColor("#e64a19"));
                        b10.setText("PLAY O");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        b9.setTextColor(Color.parseColor("#fbc02d"));
                        b10.setText("PLAY X");
                    }
                }
                endGame();
            }
        });

            b10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(b10.getText().toString().equals("PLAY AGAIN")){
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                    }
                }
            });

    }

    public void endGame(){
        String a,b,c,d,e,f,g,h,i;

        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();

        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();

        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        boolean end= false;

        if(a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X!", Toast.LENGTH_LONG).show();
        end=true;
        }
        if(d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(b.equals("X") && e.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals("X") && e.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X!", Toast.LENGTH_LONG).show();
            end=true;
        }


        if(a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(b.equals("O") && e.equals("O") && h.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals("O") && e.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O!", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(count==9 && end==false){
            Toast.makeText(MainActivity.this,"Game Drawn!", Toast.LENGTH_LONG).show();
            end=true;
        }



        if(end==true || count==9) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setText("PLAY AGAIN");

        }






    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int mid = item.getItemId();
        if(mid==R.id.homescreen)
        {
            Intent info = new Intent(this,OptionScreen.class);
            startActivity(info);
            finish();
        }

        if(mid==R.id.help)
        {
            Intent info = new Intent(this,HowToPlay.class);
            startActivity(info);
            finish();
        }

        if (mid == R.id.exit)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", null);
            AlertDialog alert = builder.create();
            alert.show();
        }

        return super.onOptionsItemSelected(item);
    }

}
