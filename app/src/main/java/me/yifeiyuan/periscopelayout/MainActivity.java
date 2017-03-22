package me.yifeiyuan.periscopelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import me.yifeiyuan.library.PeriscopeLayout;

public class MainActivity extends AppCompatActivity {

  private PeriscopeLayout periscopeLayout;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    periscopeLayout = (PeriscopeLayout) findViewById(R.id.periscope);
    findViewById(R.id.contentView).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        periscopeLayout.addOne();
      }
    });
  }
}
