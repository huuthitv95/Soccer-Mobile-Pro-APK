package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.unity3d.player.n */
/* JADX INFO: loaded from: classes7.dex */
public final class SurfaceHolderCallbackC14693n extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: a */
    private static boolean f41766a;

    /* JADX INFO: renamed from: b */
    private final Context f41767b;

    /* JADX INFO: renamed from: c */
    private final SurfaceView f41768c;

    /* JADX INFO: renamed from: d */
    private final SurfaceHolder f41769d;

    /* JADX INFO: renamed from: e */
    private final String f41770e;

    /* JADX INFO: renamed from: f */
    private final int f41771f;

    /* JADX INFO: renamed from: g */
    private final int f41772g;

    /* JADX INFO: renamed from: h */
    private final boolean f41773h;

    /* JADX INFO: renamed from: i */
    private final long f41774i;

    /* JADX INFO: renamed from: j */
    private final long f41775j;

    /* JADX INFO: renamed from: k */
    private final FrameLayout f41776k;

    /* JADX INFO: renamed from: l */
    private final Display f41777l;

    /* JADX INFO: renamed from: m */
    private int f41778m;

    /* JADX INFO: renamed from: n */
    private int f41779n;

    /* JADX INFO: renamed from: o */
    private int f41780o;

    /* JADX INFO: renamed from: p */
    private int f41781p;

    /* JADX INFO: renamed from: q */
    private MediaPlayer f41782q;

    /* JADX INFO: renamed from: r */
    private MediaController f41783r;

    /* JADX INFO: renamed from: s */
    private boolean f41784s;

    /* JADX INFO: renamed from: t */
    private boolean f41785t;

    /* JADX INFO: renamed from: u */
    private int f41786u;

    /* JADX INFO: renamed from: v */
    private boolean f41787v;

    /* JADX INFO: renamed from: w */
    private boolean f41788w;

    /* JADX INFO: renamed from: x */
    private a f41789x;

    /* JADX INFO: renamed from: y */
    private b f41790y;

    /* JADX INFO: renamed from: z */
    private volatile int f41791z;

    /* JADX INFO: renamed from: com.unity3d.player.n$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo43432a(int i);
    }

    /* JADX INFO: renamed from: com.unity3d.player.n$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        private SurfaceHolderCallbackC14693n f41793b;

        /* JADX INFO: renamed from: c */
        private boolean f41794c = false;

        public b(SurfaceHolderCallbackC14693n surfaceHolderCallbackC14693n) {
            this.f41793b = surfaceHolderCallbackC14693n;
        }

        /* JADX INFO: renamed from: a */
        public final void m43433a() {
            this.f41794c = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f41794c) {
                return;
            }
            if (SurfaceHolderCallbackC14693n.f41766a) {
                SurfaceHolderCallbackC14693n.m43427b("Stopping the video player due to timeout.");
            }
            this.f41793b.CancelOnPrepare();
        }
    }

    protected SurfaceHolderCallbackC14693n(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, a aVar) {
        super(context);
        this.f41784s = false;
        this.f41785t = false;
        this.f41786u = 0;
        this.f41787v = false;
        this.f41788w = false;
        this.f41791z = 0;
        this.f41789x = aVar;
        this.f41767b = context;
        this.f41776k = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f41768c = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f41769d = holder;
        holder.addCallback(this);
        setBackgroundColor(i);
        addView(surfaceView);
        this.f41777l = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f41770e = str;
        this.f41771f = i2;
        this.f41772g = i3;
        this.f41773h = z;
        this.f41774i = j;
        this.f41775j = j2;
        if (f41766a) {
            m43427b("fileName: " + str);
        }
        if (f41766a) {
            m43427b("backgroundColor: " + i);
        }
        if (f41766a) {
            m43427b("controlMode: " + i2);
        }
        if (f41766a) {
            m43427b("scalingMode: " + i3);
        }
        if (f41766a) {
            m43427b("isURL: " + z);
        }
        if (f41766a) {
            m43427b("videoOffset: " + j);
        }
        if (f41766a) {
            m43427b("videoLength: " + j2);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: a */
    private void m43425a(int i) {
        this.f41791z = i;
        a aVar = this.f41789x;
        if (aVar != null) {
            aVar.mo43432a(this.f41791z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m43427b(String str) {
        Log.i("Video", "VideoPlayer: " + str);
    }

    /* JADX INFO: renamed from: c */
    private void m43429c() {
        FileInputStream fileInputStream;
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(this.f41769d);
            if (this.f41787v) {
                return;
            }
            if (f41766a) {
                m43427b("Resuming playback");
            }
            this.f41782q.start();
            return;
        }
        m43425a(0);
        doCleanUp();
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f41782q = mediaPlayer2;
            if (this.f41773h) {
                mediaPlayer2.setDataSource(this.f41767b, Uri.parse(this.f41770e));
            } else {
                if (this.f41775j != 0) {
                    fileInputStream = new FileInputStream(this.f41770e);
                    this.f41782q.setDataSource(fileInputStream.getFD(), this.f41774i, this.f41775j);
                } else {
                    try {
                        AssetFileDescriptor assetFileDescriptorOpenFd = getResources().getAssets().openFd(this.f41770e);
                        this.f41782q.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException unused) {
                        fileInputStream = new FileInputStream(this.f41770e);
                        this.f41782q.setDataSource(fileInputStream.getFD());
                        fileInputStream.close();
                    }
                }
                fileInputStream.close();
            }
            this.f41782q.setDisplay(this.f41769d);
            this.f41782q.setScreenOnWhilePlaying(true);
            this.f41782q.setOnBufferingUpdateListener(this);
            this.f41782q.setOnCompletionListener(this);
            this.f41782q.setOnPreparedListener(this);
            this.f41782q.setOnVideoSizeChangedListener(this);
            this.f41782q.setAudioStreamType(3);
            this.f41782q.prepareAsync();
            this.f41790y = new b(this);
            new Thread(this.f41790y).start();
        } catch (Exception e) {
            if (f41766a) {
                m43427b("error: " + e.getMessage() + e);
            }
            m43425a(2);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m43430d() {
        if (isPlaying()) {
            return;
        }
        m43425a(1);
        if (f41766a) {
            m43427b("startVideoPlayback");
        }
        updateVideoLayout();
        if (this.f41787v) {
            return;
        }
        start();
    }

    public final void CancelOnPrepare() {
        m43425a(2);
    }

    /* JADX INFO: renamed from: a */
    final boolean m43431a() {
        return this.f41787v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    protected final void destroyPlayer() {
        if (f41766a) {
            m43427b("destroyPlayer");
        }
        if (!this.f41787v) {
            pause();
        }
        doCleanUp();
    }

    protected final void doCleanUp() {
        b bVar = this.f41790y;
        if (bVar != null) {
            bVar.m43433a();
            this.f41790y = null;
        }
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f41782q = null;
        }
        this.f41780o = 0;
        this.f41781p = 0;
        this.f41785t = false;
        this.f41784s = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        if (this.f41773h) {
            return this.f41786u;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        boolean z = this.f41785t && this.f41784s;
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer == null) {
            return !z;
        }
        return mediaPlayer.isPlaying() || !z;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (f41766a) {
            m43427b("onBufferingUpdate percent:" + i);
        }
        this.f41786u = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (f41766a) {
            m43427b("onCompletion called");
        }
        destroyPlayer();
        m43425a(3);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 && (this.f41771f != 2 || i == 0 || keyEvent.isSystem())) {
            MediaController mediaController = this.f41783r;
            return mediaController != null ? mediaController.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
        }
        destroyPlayer();
        m43425a(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (f41766a) {
            m43427b("onPrepared called");
        }
        b bVar = this.f41790y;
        if (bVar != null) {
            bVar.m43433a();
            this.f41790y = null;
        }
        int i = this.f41771f;
        if (i == 0 || i == 1) {
            MediaController mediaController = new MediaController(this.f41767b);
            this.f41783r = mediaController;
            mediaController.setMediaPlayer(this);
            this.f41783r.setAnchorView(this);
            this.f41783r.setEnabled(true);
            Context context = this.f41767b;
            if (context instanceof Activity) {
                this.f41783r.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f41783r.show();
        }
        this.f41785t = true;
        if (this.f41784s) {
            m43430d();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f41771f != 2 || action != 0) {
            MediaController mediaController = this.f41783r;
            return mediaController != null ? mediaController.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        }
        destroyPlayer();
        m43425a(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (f41766a) {
            m43427b("onVideoSizeChanged called " + i + "x" + i2);
        }
        if (i != 0 && i2 != 0) {
            this.f41784s = true;
            this.f41780o = i;
            this.f41781p = i2;
            if (this.f41785t) {
                m43430d();
                return;
            }
            return;
        }
        if (f41766a) {
            m43427b("invalid video width(" + i + ") or height(" + i2 + ")");
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer == null) {
            return;
        }
        if (this.f41788w) {
            mediaPlayer.pause();
        }
        this.f41787v = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (f41766a) {
            m43427b("Start");
        }
        MediaPlayer mediaPlayer = this.f41782q;
        if (mediaPlayer == null) {
            return;
        }
        if (this.f41788w) {
            mediaPlayer.start();
        }
        this.f41787v = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (f41766a) {
            m43427b("surfaceChanged called " + i + " " + i2 + "x" + i3);
        }
        if (this.f41778m == i2 && this.f41779n == i3) {
            return;
        }
        this.f41778m = i2;
        this.f41779n = i3;
        if (this.f41788w) {
            updateVideoLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (f41766a) {
            m43427b("surfaceCreated called");
        }
        this.f41788w = true;
        m43429c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (f41766a) {
            m43427b("surfaceDestroyed called");
        }
        this.f41788w = false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    protected final void updateVideoLayout() {
        if (f41766a) {
            m43427b("updateVideoLayout");
        }
        if (this.f41782q == null) {
            return;
        }
        if (this.f41778m == 0 || this.f41779n == 0) {
            WindowManager windowManager = (WindowManager) this.f41767b.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f41778m = displayMetrics.widthPixels;
            this.f41779n = displayMetrics.heightPixels;
        }
        int i = this.f41778m;
        int i2 = this.f41779n;
        if (this.f41784s) {
            int i3 = this.f41780o;
            int i4 = this.f41781p;
            float f = i3 / i4;
            float f2 = i / i2;
            int i5 = this.f41772g;
            if (i5 == 1) {
                if (f2 <= f) {
                    i2 = (int) (i / f);
                } else {
                    i = (int) (i2 * f);
                }
            } else if (i5 == 2) {
                if (f2 >= f) {
                    i2 = (int) (i / f);
                } else {
                    i = (int) (i2 * f);
                }
            } else if (i5 == 0) {
                i = i3;
                i2 = i4;
            }
        } else if (f41766a) {
            m43427b("updateVideoLayout: Video size is not known yet");
        }
        if (this.f41778m == i && this.f41779n == i2) {
            return;
        }
        if (f41766a) {
            m43427b("frameWidth = " + i + "; frameHeight = " + i2);
        }
        this.f41776k.updateViewLayout(this.f41768c, new FrameLayout.LayoutParams(i, i2, 17));
    }
}
