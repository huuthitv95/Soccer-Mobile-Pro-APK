package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8561f {

    /* JADX INFO: renamed from: a */
    public final BufferedReader f19333a;

    /* JADX INFO: renamed from: b */
    public final Queue f19334b;

    /* JADX INFO: renamed from: c */
    public String f19335c;

    public C8561f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.f19334b = linkedList;
        this.f19333a = bufferedReader;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21099a() throws IOException {
        String strTrim;
        if (this.f19335c != null) {
            return true;
        }
        if (!this.f19334b.isEmpty()) {
            this.f19335c = (String) this.f19334b.poll();
            return true;
        }
        do {
            String line = this.f19333a.readLine();
            this.f19335c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f19335c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }
}
