package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class FMODAudioDevice implements Runnable {

    /* JADX INFO: renamed from: h */
    private static int f41921h = 0;

    /* JADX INFO: renamed from: i */
    private static int f41922i = 1;

    /* JADX INFO: renamed from: j */
    private static int f41923j = 2;

    /* JADX INFO: renamed from: k */
    private static int f41924k = 3;

    /* JADX INFO: renamed from: l */
    private static int f41925l = 4;

    /* JADX INFO: renamed from: a */
    private volatile Thread f41926a = null;

    /* JADX INFO: renamed from: b */
    private volatile boolean f41927b = false;

    /* JADX INFO: renamed from: c */
    private AudioTrack f41928c = null;

    /* JADX INFO: renamed from: d */
    private boolean f41929d = false;

    /* JADX INFO: renamed from: e */
    private ByteBuffer f41930e = null;

    /* JADX INFO: renamed from: f */
    private byte[] f41931f = null;

    /* JADX INFO: renamed from: g */
    private volatile RunnableC15431a f41932g;

    private native int fmodGetInfo(int i);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f41928c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f41928c.stop();
            }
            this.f41928c.release();
            this.f41928c = null;
        }
        this.f41930e = null;
        this.f41931f = null;
        this.f41929d = false;
    }

    public synchronized void close() {
        stop();
    }

    native int fmodProcessMicData(ByteBuffer byteBuffer, int i);

    public boolean isRunning() {
        return this.f41926a != null && this.f41926a.isAlive();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 3;
        while (this.f41927b) {
            if (!this.f41929d && i > 0) {
                releaseAudioTrack();
                int iFmodGetInfo = fmodGetInfo(f41921h);
                int i2 = fmodGetInfo(f41925l) == 1 ? 4 : 12;
                int minBufferSize = AudioTrack.getMinBufferSize(iFmodGetInfo, i2, 2);
                int iFmodGetInfo2 = 2 * fmodGetInfo(f41925l);
                int iRound = Math.round(minBufferSize * 1.1f) & (~(iFmodGetInfo2 - 1));
                int iFmodGetInfo3 = fmodGetInfo(f41922i);
                int iFmodGetInfo4 = fmodGetInfo(f41923j) * iFmodGetInfo3 * iFmodGetInfo2;
                AudioTrack audioTrack = new AudioTrack(3, iFmodGetInfo, i2, 2, iFmodGetInfo4 > iRound ? iFmodGetInfo4 : iRound, 1);
                this.f41928c = audioTrack;
                boolean z = audioTrack.getState() == 1;
                this.f41929d = z;
                if (z) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iFmodGetInfo3 * iFmodGetInfo2);
                    this.f41930e = byteBufferAllocateDirect;
                    this.f41931f = new byte[byteBufferAllocateDirect.capacity()];
                    this.f41928c.play();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f41928c.getState() + ")");
                    releaseAudioTrack();
                    i += -1;
                }
            }
            if (this.f41929d) {
                if (fmodGetInfo(f41924k) == 1) {
                    fmodProcess(this.f41930e);
                    ByteBuffer byteBuffer = this.f41930e;
                    byteBuffer.get(this.f41931f, 0, byteBuffer.capacity());
                    this.f41928c.write(this.f41931f, 0, this.f41930e.capacity());
                    this.f41930e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f41926a != null) {
            stop();
        }
        this.f41926a = new Thread(this, "FMODAudioDevice");
        this.f41926a.setPriority(10);
        this.f41927b = true;
        this.f41926a.start();
        if (this.f41932g != null) {
            this.f41932g.m43565b();
        }
    }

    public synchronized int startAudioRecord(int i, int i2, int i3) {
        if (this.f41932g == null) {
            this.f41932g = new RunnableC15431a(this, i, i2);
            this.f41932g.m43565b();
        }
        return this.f41932g.m43564a();
    }

    public synchronized void stop() {
        while (this.f41926a != null) {
            this.f41927b = false;
            try {
                this.f41926a.join();
                this.f41926a = null;
            } catch (InterruptedException unused) {
            }
        }
        if (this.f41932g != null) {
            this.f41932g.m43566c();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.f41932g != null) {
            this.f41932g.m43566c();
            this.f41932g = null;
        }
    }
}
