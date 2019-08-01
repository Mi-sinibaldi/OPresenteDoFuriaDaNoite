package com.example.opresentedofuriadanoite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //esconde a actionBar
        getSupportActionBar().hide();

        //esconde o status e a barra de navegação
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        //executar o video - controles padrões
        videoView.setMediaController(new MediaController(this));
        //recupera o nome do pacote que vou utilizar
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.videoplayback);
        videoView.start();
    }
}
