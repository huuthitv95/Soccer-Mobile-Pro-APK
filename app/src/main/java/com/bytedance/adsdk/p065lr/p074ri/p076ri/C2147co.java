package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Path;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.jbs;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2147co implements InterfaceC2144aw, InterfaceC2155qt {

    /* JADX INFO: renamed from: di */
    private final jbs f5248di;

    /* JADX INFO: renamed from: ka */
    private final String f5251ka;

    /* JADX INFO: renamed from: ri */
    private final Path f5253ri = new Path();

    /* JADX INFO: renamed from: lr */
    private final Path f5252lr = new Path();

    /* JADX INFO: renamed from: ik */
    private final Path f5250ik = new Path();

    /* JADX INFO: renamed from: fi */
    private final List<InterfaceC2144aw> f5249fi = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.co$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f5254ri;

        static {
            int[] iArr = new int[jbs.EnumC2077ri.values().length];
            f5254ri = iArr;
            try {
                iArr[jbs.EnumC2077ri.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5254ri[jbs.EnumC2077ri.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5254ri[jbs.EnumC2077ri.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5254ri[jbs.EnumC2077ri.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5254ri[jbs.EnumC2077ri.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C2147co(jbs jbsVar) {
        this.f5251ka = jbsVar.m6837ri();
        this.f5248di = jbsVar;
    }

    /* JADX INFO: renamed from: ri */
    private void m7140ri() {
        for (int i = 0; i < this.f5249fi.size(); i++) {
            this.f5250ik.addPath(this.f5249fi.get(i).mo7131ka());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7141ri(Path.Op op) {
        this.f5252lr.reset();
        this.f5253ri.reset();
        for (int size = this.f5249fi.size() - 1; size > 0; size--) {
            InterfaceC2144aw interfaceC2144aw = this.f5249fi.get(size);
            if (interfaceC2144aw instanceof C2151ka) {
                C2151ka c2151ka = (C2151ka) interfaceC2144aw;
                List<InterfaceC2144aw> listM7158lr = c2151ka.m7158lr();
                for (int size2 = listM7158lr.size() - 1; size2 >= 0; size2--) {
                    Path pathMo7131ka = listM7158lr.get(size2).mo7131ka();
                    pathMo7131ka.transform(c2151ka.m7157ik());
                    this.f5252lr.addPath(pathMo7131ka);
                }
            } else {
                this.f5252lr.addPath(interfaceC2144aw.mo7131ka());
            }
        }
        InterfaceC2144aw interfaceC2144aw2 = this.f5249fi.get(0);
        if (interfaceC2144aw2 instanceof C2151ka) {
            C2151ka c2151ka2 = (C2151ka) interfaceC2144aw2;
            List<InterfaceC2144aw> listM7158lr2 = c2151ka2.m7158lr();
            for (int i = 0; i < listM7158lr2.size(); i++) {
                Path pathMo7131ka2 = listM7158lr2.get(i).mo7131ka();
                pathMo7131ka2.transform(c2151ka2.m7157ik());
                this.f5253ri.addPath(pathMo7131ka2);
            }
        } else {
            this.f5253ri.set(interfaceC2144aw2.mo7131ka());
        }
        this.f5250ik.op(this.f5253ri, this.f5252lr, op);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2144aw
    /* JADX INFO: renamed from: ka */
    public Path mo7131ka() {
        this.f5250ik.reset();
        if (this.f5248di.m6835ik()) {
            return this.f5250ik;
        }
        int i = AnonymousClass1.f5254ri[this.f5248di.m6836lr().ordinal()];
        if (i == 1) {
            m7140ri();
        } else if (i == 2) {
            m7141ri(Path.Op.UNION);
        } else if (i == 3) {
            m7141ri(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m7141ri(Path.Op.INTERSECT);
        } else if (i == 5) {
            m7141ri(Path.Op.XOR);
        }
        return this.f5250ik;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        for (int i = 0; i < this.f5249fi.size(); i++) {
            this.f5249fi.get(i).mo6794ri(list, list2);
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2155qt
    /* JADX INFO: renamed from: ri */
    public void mo7142ri(ListIterator<InterfaceC2150ik> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC2150ik interfaceC2150ikPrevious = listIterator.previous();
            if (interfaceC2150ikPrevious instanceof InterfaceC2144aw) {
                this.f5249fi.add((InterfaceC2144aw) interfaceC2150ikPrevious);
                listIterator.remove();
            }
        }
    }
}
