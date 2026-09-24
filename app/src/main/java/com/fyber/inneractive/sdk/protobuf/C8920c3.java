package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.c3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8920c3 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f20991a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f20992b;

    /* JADX INFO: renamed from: c */
    public Iterator f20993c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC8932e3 f20994d;

    public C8920c3(AbstractC8932e3 abstractC8932e3) {
        this.f20994d = abstractC8932e3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20991a + 1 >= this.f20994d.f21005b.size()) {
            if (this.f20994d.f21006c.isEmpty()) {
                return false;
            }
            if (this.f20993c == null) {
                this.f20993c = this.f20994d.f21006c.entrySet().iterator();
            }
            if (!this.f20993c.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f20992b = true;
        int i = this.f20991a + 1;
        this.f20991a = i;
        if (i < this.f20994d.f21005b.size()) {
            return (Map.Entry) this.f20994d.f21005b.get(this.f20991a);
        }
        if (this.f20993c == null) {
            this.f20993c = this.f20994d.f21006c.entrySet().iterator();
        }
        return (Map.Entry) this.f20993c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20992b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f20992b = false;
        AbstractC8932e3 abstractC8932e3 = this.f20994d;
        int i = AbstractC8932e3.f21003h;
        abstractC8932e3.m21536a();
        if (this.f20991a >= this.f20994d.f21005b.size()) {
            if (this.f20993c == null) {
                this.f20993c = this.f20994d.f21006c.entrySet().iterator();
            }
            this.f20993c.remove();
            return;
        }
        AbstractC8932e3 abstractC8932e4 = this.f20994d;
        int i2 = this.f20991a;
        this.f20991a = i2 - 1;
        abstractC8932e4.m21536a();
        Object obj = ((C8914b3) abstractC8932e4.f21005b.remove(i2)).f20987b;
        if (abstractC8932e4.f21006c.isEmpty()) {
            return;
        }
        Iterator it = abstractC8932e4.m21538c().entrySet().iterator();
        abstractC8932e4.f21005b.add(new C8914b3(abstractC8932e4, (Map.Entry) it.next()));
        it.remove();
    }
}
