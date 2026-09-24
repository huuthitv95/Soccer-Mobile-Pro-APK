package com.mbridge.msdk.thrid.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.InterfaceC13794d;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.p */
/* JADX INFO: compiled from: FormBody.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13780p extends AbstractC13790z {

    /* JADX INFO: renamed from: c */
    private static final C13785u f39168c = C13785u.m40766a(ShareTarget.ENCODING_TYPE_URL_ENCODED);

    /* JADX INFO: renamed from: a */
    private final List<String> f39169a;

    /* JADX INFO: renamed from: b */
    private final List<String> f39170b;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.p$a */
    /* JADX INFO: compiled from: FormBody.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List<String> f39171a;

        /* JADX INFO: renamed from: b */
        private final List<String> f39172b;

        /* JADX INFO: renamed from: c */
        private final Charset f39173c;

        public a() {
            this(null);
        }

        public a(Charset charset) {
            this.f39171a = new ArrayList();
            this.f39172b = new ArrayList();
            this.f39173c = charset;
        }

        /* JADX INFO: renamed from: a */
        public a m40695a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f39171a.add(C13783s.m40720a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f39173c));
            this.f39172b.add(C13783s.m40720a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f39173c));
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13780p m40696a() {
            return new C13780p(this.f39171a, this.f39172b);
        }
    }

    C13780p(List<String> list, List<String> list2) {
        this.f39169a = C13723c.m40276a(list);
        this.f39170b = C13723c.m40276a(list2);
    }

    /* JADX INFO: renamed from: a */
    private long m40691a(@Nullable InterfaceC13794d interfaceC13794d, boolean z) {
        C13793c c13793c = z ? new C13793c() : interfaceC13794d.mo40865a();
        int size = this.f39169a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c13793c.writeByte(38);
            }
            c13793c.mo40873a(this.f39169a.get(i));
            c13793c.writeByte(61);
            c13793c.mo40873a(this.f39170b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long size2 = c13793c.size();
        c13793c.m40899k();
        return size2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13790z
    /* JADX INFO: renamed from: a */
    public long mo40692a() {
        return m40691a((InterfaceC13794d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13790z
    /* JADX INFO: renamed from: a */
    public void mo40693a(InterfaceC13794d interfaceC13794d) throws IOException {
        m40691a(interfaceC13794d, false);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13790z
    /* JADX INFO: renamed from: b */
    public C13785u mo40694b() {
        return f39168c;
    }
}
