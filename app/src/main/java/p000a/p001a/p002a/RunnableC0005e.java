package p000a.p001a.p002a;

import com.gadsme.nativeplugin.Plugin;
import com.gadsme.nativeplugin.WebTexture;

/* JADX INFO: renamed from: a.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0005e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WebTexture f5b;

    public RunnableC0005e(WebTexture webTexture, int i) {
        this.f5b = webTexture;
        this.f4a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        synchronized (this) {
            z = this.f5b.f21797w;
            z2 = this.f5b.f21781g;
            z3 = this.f5b.f21780f;
            i = this.f5b.f21798x;
        }
        if ((!z || (z3 && !z2)) && i == this.f4a) {
            synchronized (this.f5b) {
                this.f5b.f21797w = true;
                this.f5b.f21778d = true;
            }
            Plugin.SendMessage("WebTexture", this.f5b.f21796v, "pageLoaded");
        }
    }
}
