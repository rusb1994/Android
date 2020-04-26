package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        show = findViewById(R.id.show);
    }
    private AlertDialog.Builder setPositiveButton(AlertDialog.Builder builder)
    {
        // 调用setPositiveButton方法添加“Sign in”按钮
        return builder.setPositiveButton("Sign in", (dialog, which) -> show.setText("Sign in ！"));
    }
    private AlertDialog.Builder setNegativeButton(AlertDialog.Builder builder)
    {
        // 调用setNegativeButton方法添加“Cancel”按钮
        return builder.setNegativeButton("Cancel", (dialog, which) -> show.setText("Cancel ！"));
    }
    public void customView(View source)
    {
        // 加载\res\layout\login.xml界面布局文件
        LinearLayout loginForm = (LinearLayout) getLayoutInflater().inflate(R.layout.login, null);
        // 设置对话框显示的View对象
        AlertDialog.Builder builder = new AlertDialog.Builder(this).setView(loginForm);
        // 为AlertDialog.Builder添加“确定”按钮
        setPositiveButton(builder);
        // 为AlertDialog.Builder添加“取消”按钮
        setNegativeButton(builder).create().show();
    }
}