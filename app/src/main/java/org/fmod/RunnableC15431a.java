package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: org.fmod.a */
/* JADX INFO: loaded from: classes8.dex */
final class RunnableC15431a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final FMODAudioDevice f41933a;

    /* JADX INFO: renamed from: b */
    private final ByteBuffer f41934b;

    /* JADX INFO: renamed from: c */
    private final int f41935c;

    /* JADX INFO: renamed from: d */
    private final int f41936d;

    /* JADX INFO: renamed from: e */
    private final int f41937e = 2;

    /* JADX INFO: renamed from: f */
    private volatile Thread f41938f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f41939g;

    /* JADX INFO: renamed from: h */
    private AudioRecord f41940h;

    /* JADX INFO: renamed from: i */
    private boolean f41941i;

    RunnableC15431a(FMODAudioDevice fMODAudioDevice, int i, int i2) {
        this.f41933a = fMODAudioDevice;
        this.f41935c = i;
        this.f41936d = i2;
        this.f41934b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i, i2, 2));
    }

    /* JADX INFO: renamed from: d */
    private void m43563d() {
        AudioRecord audioRecord = this.f41940h;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f41940h.stop();
            }
            this.f41940h.release();
            this.f41940h = null;
        }
        this.f41934b.position(0);
        this.f41941i = false;
    }

    /* JADX INFO: renamed from: a */
    public final int m43564a() {
        return this.f41934b.capacity();
    }

    /* JADX INFO: renamed from: b */
    public final void m43565b() {
        if (this.f41938f != null) {
            m43566c();
        }
        this.f41939g = true;
        this.f41938f = new Thread(this);
        this.f41938f.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m43566c() {
        while (this.f41938f != null) {
            this.f41939g = false;
            try {
                this.f41938f.join();
                this.f41938f = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        while (this.f41939g) {
            if (!this.f41941i && i > 0) {
                m43563d();
                AudioRecord audioRecord = new AudioRecord(1, this.f41935c, this.f41936d, this.f41937e, this.f41934b.capacity());
                this.f41940h = audioRecord;
                boolean z = audioRecord.getState() == 1;
                this.f41941i = z;
                if (z) {
                    this.f41934b.position(0);
                    this.f41940h.startRecording();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f41940h.getState() + ")");
                    i += -1;
                    m43563d();
                }
            }
            if (this.f41941i && this.f41940h.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f41940h;
                ByteBuffer byteBuffer = this.f41934b;
                this.f41933a.fmodProcessMicData(this.f41934b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.f41934b.position(0);
            }
        }
        m43563d();
    }
}
