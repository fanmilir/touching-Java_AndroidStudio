package com.android_learning.chapter3.autocompletedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, FRUITS);
        AutoCompleteTextView tv1 = (AutoCompleteTextView) findViewById(R.id.text1);
        tv1.setAdapter(adapter);

        MultiAutoCompleteTextView tv2 = (MultiAutoCompleteTextView) findViewById(R.id.text2);
        tv2.setAdapter(adapter);
        tv2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    static final String[] FRUITS = new String[] {
            "苹果 ","杏子 ","槟榔子","香蕉 ","山毛榉坚果 ","海棠果 ","酸橙 ","黑莓 ","杨桃 ","樱桃 ",
            "栗子 ","板栗 ","猕猴桃 ","山核桃 ","椰子","金桔 ","西洋李子 ","砀山梨 ","毛桃 ","干果 ",
            "公爵樱桃 ","无花果 ","榛子 ","鲜荔枝 ","白果","葡萄 ","青梅 ","哈密瓜 ","山楂果 ","山楂 ",
            "水蜜桃 ","柠檬 ","荔枝 ","桂圆","枇杷 ","柑桔 ","芒果 ","黑樱桃 ","香瓜","脐橙 ","坚果",
            "沙枣 ","桃子 ","梨 ","菠萝 ","李子 ","李杏 ","石榴 ","柚子","杨梅","草莓 ","无核小葡萄 ",
            "胡桃","荸荠 ","西瓜"

    };
}
