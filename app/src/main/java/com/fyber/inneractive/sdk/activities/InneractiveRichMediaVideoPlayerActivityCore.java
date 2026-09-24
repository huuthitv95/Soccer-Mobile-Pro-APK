package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* JADX INFO: renamed from: a */
    public VideoView f17479a;

    /* JADX INFO: renamed from: b */
    public int f17480b = 0;

    /* JADX INFO: renamed from: c */
    public final C7824n f17481c = new C7824n(this);

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra("video_url", str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.m21945a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f17480b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(C7809R.layout.ia_layout_rich_media_video);
        this.f17479a = (VideoView) findViewById(C7809R.id.mraid_video_view);
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra("video_url")) ? null : intent.getStringExtra("video_url");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m21945a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f17479a.setVideoPath(stringExtra);
            this.f17479a.setOnCompletionListener(new C7826p(this));
            this.f17479a.setOnErrorListener(new C7827q(this));
            this.f17479a.setOnPreparedListener(this.f17481c);
        }
        findViewById(C7809R.id.ia_iv_close_button).setOnClickListener(new ViewOnClickListenerC7825o(this));
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f17480b = this.f17479a.getCurrentPosition();
        this.f17479a.pause();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f17479a;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }
}
