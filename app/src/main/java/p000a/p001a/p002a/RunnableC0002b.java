package p000a.p001a.p002a;

import com.gadsme.nativeplugin.WebTexture;

/* JADX INFO: renamed from: a.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0002b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WebTexture f1a;

    public RunnableC0002b(WebTexture webTexture) {
        this.f1a = webTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f1a) {
            WebTexture webTexture = this.f1a;
            webTexture.f21779e = webTexture.f21787m <= 0;
        }
    }
}
