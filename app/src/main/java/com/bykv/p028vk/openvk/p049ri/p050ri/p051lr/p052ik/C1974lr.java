package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.C1983ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p056lr.C1980ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.C1995ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.C2002lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.ironsource.C11744X3;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C1974lr extends AbstractC1975ri {

    /* JADX INFO: renamed from: di */
    private final Object f4544di;

    /* JADX INFO: renamed from: fi */
    private Surface f4545fi;

    /* JADX INFO: renamed from: ik */
    private final ri f4546ik;

    /* JADX INFO: renamed from: ka */
    private C1983ri f4547ka;

    /* JADX INFO: renamed from: lr */
    private final MediaPlayer f4548lr;
    private volatile boolean xha;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ik.lr$ri */
    private static class ri implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: ri */
        private final WeakReference<C1974lr> f4549ri;

        public ri(C1974lr c1974lr) {
            this.f4549ri = new WeakReference<>(c1974lr);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                C1974lr c1974lr = this.f4549ri.get();
                if (c1974lr != null) {
                    c1974lr.m6200ri(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                C1974lr c1974lr = this.f4549ri.get();
                if (c1974lr != null) {
                    c1974lr.m6195ik();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                Integer.valueOf(i);
                Integer.valueOf(i2);
                C1974lr c1974lr = this.f4549ri.get();
                return c1974lr != null && c1974lr.m6202ri(i, i2);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C1974lr c1974lr = this.f4549ri.get();
                return c1974lr != null && c1974lr.m6198lr(i, i2);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                C1974lr c1974lr = this.f4549ri.get();
                if (c1974lr != null) {
                    c1974lr.m6197lr();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                C1974lr c1974lr = this.f4549ri.get();
                if (c1974lr != null) {
                    c1974lr.m6196ka();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C1974lr c1974lr = this.f4549ri.get();
                if (c1974lr != null) {
                    c1974lr.m6201ri(i, i2, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C1974lr() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f4544di = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f4548lr = mediaPlayer;
        }
        m6194ri(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.f4546ik = new ri(this);
        m6192bu();
    }

    /* JADX INFO: renamed from: bu */
    private void m6192bu() {
        this.f4548lr.setOnPreparedListener(this.f4546ik);
        this.f4548lr.setOnBufferingUpdateListener(this.f4546ik);
        this.f4548lr.setOnCompletionListener(this.f4546ik);
        this.f4548lr.setOnSeekCompleteListener(this.f4546ik);
        this.f4548lr.setOnVideoSizeChangedListener(this.f4546ik);
        this.f4548lr.setOnErrorListener(this.f4546ik);
        this.f4548lr.setOnInfoListener(this.f4546ik);
    }

    /* JADX INFO: renamed from: nr */
    private void m6193nr() {
        try {
            Surface surface = this.f4545fi;
            if (surface != null) {
                surface.release();
                this.f4545fi = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6194ri(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(C1995ik.m6295ri(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    private void slm() {
        C1983ri c1983ri = this.f4547ka;
        if (c1983ri != null) {
            try {
                c1983ri.close();
            } catch (Throwable unused) {
            }
            this.f4547ka = null;
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: aw */
    public void mo6088aw() throws Throwable {
        try {
            this.f4548lr.reset();
        } catch (Throwable unused) {
        }
        slm();
        m6199ri();
        m6192bu();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    public int bgr() {
        MediaPlayer mediaPlayer = this.f4548lr;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: co */
    public void mo6089co() throws Throwable {
        synchronized (this.f4544di) {
            if (!this.xha) {
                this.f4548lr.release();
                this.xha = true;
                m6193nr();
                slm();
                m6199ri();
                m6192bu();
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: di */
    public void mo6090di() throws Throwable {
        this.f4548lr.start();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: fi */
    public PlaybackParams mo6091fi() throws IllegalStateException {
        return this.f4548lr.getPlaybackParams();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        m6193nr();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ik */
    public void mo6092ik(boolean z) throws Throwable {
        this.f4548lr.setLooping(z);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    public void jbs() {
        MediaPlayer mediaPlayer = this.f4548lr;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ka */
    public void mo6093ka(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.f4548lr;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: lr */
    public void mo6094lr(boolean z) throws Throwable {
        this.f4548lr.setScreenOnWhilePlaying(z);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: mj */
    public void mo6095mj() throws Throwable {
        this.f4548lr.pause();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: qt */
    public long mo6096qt() {
        try {
            return this.f4548lr.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ri */
    public void mo6097ri(long j, int i) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.f4548lr.seekTo((int) j);
            return;
        }
        if (i == 0) {
            this.f4548lr.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            this.f4548lr.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            this.f4548lr.seekTo((int) j, 2);
        } else if (i != 3) {
            this.f4548lr.seekTo((int) j);
        } else {
            this.f4548lr.seekTo((int) j, 3);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ri */
    public void mo6098ri(Surface surface) {
        m6193nr();
        this.f4545fi = surface;
        this.f4548lr.setSurface(surface);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ri */
    public void mo6099ri(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f4544di) {
            try {
                if (!this.xha && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f4556ri) {
                    this.f4548lr.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ri */
    public synchronized void mo6107ri(C1996ik c1996ik) {
        this.f4547ka = C1983ri.m6246ri(C1995ik.m6295ri(), c1996ik);
        C1980ik.m6222ri(c1996ik);
        this.f4548lr.setDataSource(this.f4547ka);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ri */
    public void mo6108ri(C2002lr c2002lr) throws Throwable {
        this.f4548lr.setPlaybackParams(this.f4548lr.getPlaybackParams().setSpeed(c2002lr.m6420ri()));
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ri */
    public void mo6109ri(FileDescriptor fileDescriptor) throws Throwable {
        this.f4548lr.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: ri */
    public void mo6110ri(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase(C11744X3.i.f26356b)) {
            this.f4548lr.setDataSource(str);
        } else {
            this.f4548lr.setDataSource(uri.getPath());
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: sf */
    public long mo6112sf() {
        try {
            return this.f4548lr.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    /* JADX INFO: renamed from: vr */
    public int mo6113vr() {
        MediaPlayer mediaPlayer = this.f4548lr;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik
    public void xha() throws Throwable {
        this.f4548lr.stop();
    }
}
