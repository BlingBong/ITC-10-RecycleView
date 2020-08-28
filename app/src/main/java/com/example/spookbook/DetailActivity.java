package com.example.spookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    public final static String EXTRA_TITLE = "TITLE";
    public final static String EXTRA_COVER = "COVER";
    public final static String EXTRA_AUTHOR = "AUTHOR";
    public final static String EXTRA_DESCRIPTION = "DESC";
    private ImageView ivCover;
    private TextView tvTitle, tvDescription, tvAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivCover = findViewById(R.id.iv_xcover);
        tvTitle = findViewById(R.id.tv_xtitle);
        tvAuthor = findViewById(R.id.tv_xauthor);
        tvDescription = findViewById(R.id.tv_description);

        String title = getIntent().getStringExtra(EXTRA_TITLE);
        String desc = getIntent(). getStringExtra(EXTRA_DESCRIPTION);
        String author = getIntent().getStringExtra(EXTRA_AUTHOR);
        int image = getIntent().getIntExtra(EXTRA_COVER, 0);

        Glide.with(this)
                .load(image)
                .apply(new RequestOptions().override(180,240))
                .into(ivCover);
        tvTitle.setText(title);
        tvAuthor.setText("Author : " + author);
        tvDescription.setText(desc);
    }
}
