package com.bytedance.sdk.component.p145fi.p146lr.p147ik;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.p145fi.InterfaceC2589ac;
import com.bytedance.sdk.component.p145fi.InterfaceC2590aw;
import com.bytedance.sdk.component.p145fi.InterfaceC2591bu;
import com.bytedance.sdk.component.p145fi.InterfaceC2595ik;
import com.bytedance.sdk.component.p145fi.InterfaceC2596ka;
import com.bytedance.sdk.component.p145fi.InterfaceC2597lr;
import com.bytedance.sdk.component.p145fi.InterfaceC2623nr;
import com.bytedance.sdk.component.p145fi.ihz;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2603lr;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.C2607lr;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p150lr.C2608ik;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p150lr.C2609lr;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p150lr.C2610ri;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p151ri.C2612lr;
import com.bytedance.sdk.component.p145fi.p146lr.p153ri.C2620lr;
import com.bytedance.sdk.component.p145fi.p154ri.C2629ri;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2598di {

    /* JADX INFO: renamed from: di */
    private InterfaceC2596ka f7248di;

    /* JADX INFO: renamed from: ik */
    private volatile InterfaceC2591bu f7250ik;
    private Context jbs;

    /* JADX INFO: renamed from: ka */
    private volatile InterfaceC2623nr f7251ka;

    /* JADX INFO: renamed from: lr */
    private final InterfaceC2590aw f7252lr;

    /* JADX INFO: renamed from: mj */
    private ExecutorService f7253mj;
    private ExecutorService xha;

    /* JADX INFO: renamed from: ri */
    private Map<String, List<C2600ik>> f7254ri = new ConcurrentHashMap();

    /* JADX INFO: renamed from: fi */
    private Map<String, InterfaceC2595ik> f7249fi = new ConcurrentHashMap();

    public C2598di(Context context, InterfaceC2590aw interfaceC2590aw) {
        this.f7252lr = (InterfaceC2590aw) xha.m9720ri(interfaceC2590aw);
        this.jbs = context;
        C2607lr.m9702ri(context, interfaceC2590aw.mo9556fi());
    }

    /* JADX INFO: renamed from: ka */
    private InterfaceC2595ik m9580ka(InterfaceC2597lr interfaceC2597lr) {
        InterfaceC2595ik interfaceC2595ikMo9558ka = this.f7252lr.mo9558ka();
        return interfaceC2595ikMo9558ka != null ? interfaceC2595ikMo9558ka : new C2612lr(interfaceC2597lr.mo9578mj(), interfaceC2597lr.mo9579ri());
    }

    /* JADX INFO: renamed from: qt */
    private InterfaceC2596ka m9581qt() {
        InterfaceC2596ka interfaceC2596kaMo9557ik = this.f7252lr.mo9557ik();
        return interfaceC2596kaMo9557ik == null ? new C2629ri() : interfaceC2596kaMo9557ik;
    }

    /* JADX INFO: renamed from: sf */
    private ExecutorService m9582sf() {
        ExecutorService executorServiceMo9560ri = this.f7252lr.mo9560ri();
        return executorServiceMo9560ri != null ? executorServiceMo9560ri : C2620lr.m9734ri();
    }

    /* JADX INFO: renamed from: di */
    public ExecutorService m9583di() {
        ExecutorService executorServiceMo9554ri;
        InterfaceC2589ac interfaceC2589acMo9559lr = this.f7252lr.mo9559lr();
        if (interfaceC2589acMo9559lr != null && (executorServiceMo9554ri = interfaceC2589acMo9559lr.mo9554ri()) != null) {
            return executorServiceMo9554ri;
        }
        if (this.xha == null) {
            this.xha = m9582sf();
        }
        return this.xha;
    }

    /* JADX INFO: renamed from: fi */
    public InterfaceC2596ka m9584fi() {
        if (this.f7248di == null) {
            this.f7248di = m9581qt();
        }
        return this.f7248di;
    }

    /* JADX INFO: renamed from: ik */
    public InterfaceC2595ik m9585ik(InterfaceC2597lr interfaceC2597lr) {
        if (interfaceC2597lr == null) {
            interfaceC2597lr = C2607lr.jbs();
        }
        String string = interfaceC2597lr.mo9578mj().toString();
        InterfaceC2595ik interfaceC2595ik = this.f7249fi.get(string);
        if (interfaceC2595ik != null) {
            return interfaceC2595ik;
        }
        InterfaceC2595ik interfaceC2595ikM9580ka = m9580ka(interfaceC2597lr);
        this.f7249fi.put(string, interfaceC2595ikM9580ka);
        return interfaceC2595ikM9580ka;
    }

    /* JADX INFO: renamed from: ik */
    public InterfaceC2623nr m9586ik() {
        return this.f7251ka;
    }

    public Map<String, List<C2600ik>> jbs() {
        return this.f7254ri;
    }

    /* JADX INFO: renamed from: ka */
    public Collection<InterfaceC2595ik> m9587ka() {
        return this.f7249fi.values();
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC2623nr m9588lr(InterfaceC2597lr interfaceC2597lr) {
        if (interfaceC2597lr == null) {
            interfaceC2597lr = C2607lr.jbs();
        }
        if (this.f7251ka == null) {
            synchronized (C2609lr.class) {
                if (this.f7251ka == null) {
                    this.f7251ka = new C2609lr(interfaceC2597lr.mo9577lr(), interfaceC2597lr.mo9576ka());
                }
            }
        }
        return this.f7251ka;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m9589lr() {
        return this.f7252lr.xha();
    }

    /* JADX INFO: renamed from: mj */
    public ExecutorService m9590mj() {
        ExecutorService executorServiceMo9553lr;
        InterfaceC2589ac interfaceC2589acMo9559lr = this.f7252lr.mo9559lr();
        if (interfaceC2589acMo9559lr != null && (executorServiceMo9553lr = interfaceC2589acMo9559lr.mo9553lr()) != null) {
            return executorServiceMo9553lr;
        }
        if (this.f7253mj == null) {
            this.f7253mj = C2620lr.m9734ri();
        }
        return this.f7253mj;
    }

    /* JADX INFO: renamed from: ri */
    public Context m9591ri() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public InterfaceC2591bu m9592ri(InterfaceC2597lr interfaceC2597lr) {
        if (interfaceC2597lr == null) {
            interfaceC2597lr = C2607lr.jbs();
        }
        if (this.f7250ik == null) {
            synchronized (C2608ik.class) {
                if (this.f7250ik == null) {
                    this.f7250ik = new C2608ik(new C2610ri(interfaceC2597lr.mo9577lr(), interfaceC2597lr.mo9575ik()));
                }
            }
        }
        return this.f7250ik;
    }

    /* JADX INFO: renamed from: ri */
    public InterfaceC2595ik m9593ri(String str) {
        return m9585ik(C2607lr.m9701ri(new File(str)));
    }

    /* JADX INFO: renamed from: ri */
    public C2603lr m9594ri(C2600ik c2600ik) {
        ImageView.ScaleType scaleTypeJbs = c2600ik.jbs();
        if (scaleTypeJbs == null) {
            scaleTypeJbs = C2603lr.f7334ri;
        }
        ImageView.ScaleType scaleType = scaleTypeJbs;
        Bitmap.Config configM9628qt = c2600ik.m9628qt();
        if (configM9628qt == null) {
            configM9628qt = C2603lr.f7333lr;
        }
        return new C2603lr(c2600ik.mo9570lr(), c2600ik.mo9569ik(), scaleType, configM9628qt, c2600ik.m9624ka(), c2600ik.m9623fi());
    }

    public ihz xha() {
        InterfaceC2590aw interfaceC2590aw = this.f7252lr;
        if (interfaceC2590aw != null) {
            return interfaceC2590aw.mo9555di();
        }
        return null;
    }
}
