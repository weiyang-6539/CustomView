package com.lemon.customview.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lemon.customview.R;
import com.lemon.customview.widget.MarqueeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MarqueeViewActivity extends AppCompatActivity {

    @BindView(R.id.mv_main1)
    MarqueeView mMvMain1;
    @BindView(R.id.mv_main2)
    MarqueeView mMvMain2;
    @BindView(R.id.mv_main3)
    MarqueeView mMvMain3;

    private String content2;
    private String content3;
    private List<String> list1 = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marquee_view);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        content2 = "让我掉下眼泪的，不止昨夜的酒";
        content3 = "窥天意竭心力，皆为吾主……";
        list1.add("风起日落，天行有常");
        list1.add("欲别去归隐，不复奢望");
        list1.add("只盼明日，能共沐晨光");
    }

    @OnClick({R.id.bt_control0, R.id.bt_control4, R.id.bt_control24, R.id.bt_control23, R.id.bt_control, R.id.bt_control2, R.id.bt_control00})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_control0:
                mMvMain1.setContent(list1);
                mMvMain2.setContent(content2);
                mMvMain3.setContent(content3);
                break;
            case R.id.bt_control4:
                mMvMain2.setTextColor(R.color.colorAccent);
                break;
            case R.id.bt_control24:
                mMvMain2.setTextSize(17);
                break;
            case R.id.bt_control23:
                mMvMain2.setTextSpeed(5);
                break;
            case R.id.bt_control:
                mMvMain3.continueRoll();
                break;
            case R.id.bt_control2:
                mMvMain3.stopRoll();
                break;
            case R.id.bt_control00:
                mMvMain3.setTextDistance(50);//设置3的间距
                break;
        }
    }
}
