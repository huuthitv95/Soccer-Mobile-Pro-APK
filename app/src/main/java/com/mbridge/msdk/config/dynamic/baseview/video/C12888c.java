package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.video.c */
/* JADX INFO: compiled from: LocalVideoFileMonitor.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12888c {

    /* JADX INFO: renamed from: b */
    private Context f34672b;

    /* JADX INFO: renamed from: c */
    private SimpleExoPlayer f34673c;

    /* JADX INFO: renamed from: d */
    private String f34674d;

    /* JADX INFO: renamed from: e */
    private InterfaceC12886a f34675e;

    /* JADX INFO: renamed from: a */
    private int f34671a = 5000;

    /* JADX INFO: renamed from: f */
    private long f34676f = 0;

    /* JADX INFO: renamed from: g */
    private long f34677g = 0;

    /* JADX INFO: renamed from: h */
    private long f34678h = 0;

    /* JADX INFO: renamed from: i */
    private long f34679i = 0;

    /* JADX INFO: renamed from: j */
    private final Handler f34680j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private final Runnable f34681k = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.video.c$a */
    /* JADX INFO: compiled from: LocalVideoFileMonitor.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12888c.this.m36027b();
        }
    }

    public C12888c(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.f34672b = context;
        this.f34673c = simpleExoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m36027b() {
        C13219q0.m37816b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.f34674d);
            if (file.exists()) {
                m36025a(file);
                return;
            }
            C13219q0.m37816b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
            if (System.currentTimeMillis() - this.f34676f < this.f34671a) {
                this.f34680j.postDelayed(this.f34681k, 1000L);
            } else {
                m36026a("resource buffer exception file is not found");
            }
        } catch (Exception e) {
            m36026a("resource buffer exception" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m36028d() {
        this.f34676f = 0L;
        this.f34677g = 0L;
        this.f34678h = 0L;
        this.f34679i = 0L;
    }

    /* JADX INFO: renamed from: e */
    private void m36029e() {
        if (this.f34673c != null) {
            InterfaceC12886a interfaceC12886a = this.f34675e;
            if (interfaceC12886a != null) {
                interfaceC12886a.onBufferingEnd();
            }
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f34672b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.f34674d));
            this.f34673c.setRepeatMode(0);
            this.f34673c.prepare(extractorMediaSourceCreateMediaSource);
            this.f34673c.seekTo(this.f34677g);
            this.f34673c.setPlayWhenReady(true);
        }
        m36023a();
    }

    /* JADX INFO: renamed from: c */
    public void m36032c() {
        m36023a();
        this.f34677g = 0L;
        this.f34678h = 0L;
        this.f34679i = 0L;
        this.f34672b = null;
        this.f34673c = null;
        this.f34675e = null;
    }

    /* JADX INFO: renamed from: a */
    public void m36030a(String str, InterfaceC12886a interfaceC12886a, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34675e = interfaceC12886a;
        if (i > 0) {
            this.f34671a = i * 1000;
        }
        this.f34674d = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m36031a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        C13219q0.m37816b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        m36028d();
        InterfaceC12886a interfaceC12886a = this.f34675e;
        if (interfaceC12886a != null) {
            interfaceC12886a.onBufferingStart();
        }
        this.f34676f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.f34673c;
        if (simpleExoPlayer != null) {
            this.f34677g = simpleExoPlayer.getCurrentPosition();
        }
        this.f34680j.post(this.f34681k);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m36025a(File file) {
        C13219q0.m37816b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long jLastModified = file.lastModified();
        long j = this.f34678h;
        boolean z = (j == 0 || length == j) ? false : true;
        long j2 = this.f34679i;
        boolean z2 = (j2 == 0 || jLastModified == j2) ? false : true;
        this.f34678h = length;
        this.f34679i = jLastModified;
        if (z || z2) {
            C13219q0.m37816b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            m36029e();
        } else if (System.currentTimeMillis() - this.f34676f < this.f34671a) {
            this.f34680j.postDelayed(this.f34681k, 1000L);
        } else {
            m36026a("resource buffer time out");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36023a() {
        this.f34680j.removeCallbacks(this.f34681k);
    }

    /* JADX INFO: renamed from: a */
    private void m36026a(String str) {
        C13219q0.m37816b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        InterfaceC12886a interfaceC12886a = this.f34675e;
        if (interfaceC12886a != null) {
            interfaceC12886a.onBufferingTimeOut(str);
            this.f34675e.onPlayError(str);
        }
    }
}
