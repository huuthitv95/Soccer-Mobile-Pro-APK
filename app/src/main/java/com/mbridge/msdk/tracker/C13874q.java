package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.q */
/* JADX INFO: compiled from: ProcessorWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
class C13874q implements InterfaceC13825l {

    /* JADX INFO: renamed from: a */
    private final C13820g f39609a;

    public C13874q(C13820g c13820g) {
        this.f39609a = c13820g;
    }

    @Override // com.mbridge.msdk.tracker.InterfaceC13825l
    /* JADX INFO: renamed from: a */
    public void mo41022a(C13818e c13818e) {
        if (C13882y.m41417b(this.f39609a)) {
            return;
        }
        this.f39609a.mo41022a(c13818e);
    }

    @Override // com.mbridge.msdk.tracker.InterfaceC13825l
    /* JADX INFO: renamed from: a */
    public long[] mo41023a() {
        return C13882y.m41417b(this.f39609a) ? new long[]{0, 0} : this.f39609a.mo41023a();
    }

    @Override // com.mbridge.msdk.tracker.InterfaceC13825l
    /* JADX INFO: renamed from: b */
    public void mo41024b(C13818e c13818e) {
        if (C13882y.m41417b(this.f39609a)) {
            return;
        }
        try {
            InterfaceC13821h interfaceC13821hM41015j = c13818e.m41015j();
            if (C13882y.m41414a(interfaceC13821hM41015j)) {
                c13818e.m41006a(interfaceC13821hM41015j.mo37284a(c13818e));
            }
            this.f39609a.mo41024b(c13818e);
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "process event error", e);
            }
        }
    }
}
