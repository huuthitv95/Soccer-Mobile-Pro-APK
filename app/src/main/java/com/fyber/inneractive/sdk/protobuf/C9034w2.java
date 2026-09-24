package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.w2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9034w2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f21155a;

    /* JADX INFO: renamed from: b */
    public Iterator f21156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC8932e3 f21157c;

    public C9034w2(AbstractC8932e3 abstractC8932e3) {
        this.f21157c = abstractC8932e3;
        this.f21155a = abstractC8932e3.f21005b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f21155a;
        if (i > 0 && i <= this.f21157c.f21005b.size()) {
            return true;
        }
        if (this.f21156b == null) {
            this.f21156b = this.f21157c.f21009f.entrySet().iterator();
        }
        return this.f21156b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21156b == null) {
            this.f21156b = this.f21157c.f21009f.entrySet().iterator();
        }
        if (this.f21156b.hasNext()) {
            if (this.f21156b == null) {
                this.f21156b = this.f21157c.f21009f.entrySet().iterator();
            }
            return (Map.Entry) this.f21156b.next();
        }
        List list = this.f21157c.f21005b;
        int i = this.f21155a - 1;
        this.f21155a = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
