package p000a.p001a.p002a;

import android.os.Handler;
import android.os.Looper;
import com.gadsme.nativeplugin.WebTexture;

/* JADX INFO: renamed from: a.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0004d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WebTexture f3a;

    public RunnableC0004d(WebTexture webTexture) {
        this.f3a = webTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        synchronized (this.f3a) {
            z = this.f3a.f21788n;
        }
        if (z) {
            return;
        }
        WebTexture webTexture = this.f3a;
        webTexture.m22112b();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0004d(webTexture), 100L);
    }
}
