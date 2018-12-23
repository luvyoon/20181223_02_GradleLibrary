package kr.tjeit.a20181223_02_gradlelibrary;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends BaseActivity {



    private android.widget.ImageView profileImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        String iuProfileImageUrl = "http://soopent.com/data/file/star0101/thumb_profile/latest_300px_2009604243_i831tcwE_latest_300px_3547050131_WOpCfNzV_5.jpg.jpg.jpg";
        Glide.with(mContext).load(iuProfileImageUrl).into(profileImgView);



    }

    @Override
    public void bindViews() {

        this.profileImgView = (ImageView) findViewById(R.id.profileImgView);
    }
}
