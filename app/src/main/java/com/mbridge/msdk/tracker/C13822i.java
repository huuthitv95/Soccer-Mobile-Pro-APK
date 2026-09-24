package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.i */
/* JADX INFO: compiled from: EventTable.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13822i implements Serializable {

    /* JADX INFO: renamed from: i */
    static String f39390i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* JADX INFO: renamed from: j */
    static String f39391j = "DROP TABLE IF EXISTS %s";

    /* JADX INFO: renamed from: a */
    private final C13818e f39392a;

    /* JADX INFO: renamed from: b */
    private int f39393b;

    /* JADX INFO: renamed from: c */
    private int f39394c;

    /* JADX INFO: renamed from: d */
    private final String f39395d;

    /* JADX INFO: renamed from: e */
    private long f39396e;

    /* JADX INFO: renamed from: f */
    private boolean f39397f = false;

    /* JADX INFO: renamed from: g */
    private boolean f39398g = false;

    /* JADX INFO: renamed from: h */
    private String f39399h;

    public C13822i(C13818e c13818e) {
        this.f39392a = c13818e;
        this.f39395d = c13818e.m41019n();
    }

    /* JADX INFO: renamed from: a */
    public void m41025a(int i) {
        this.f39393b = i;
    }

    /* JADX INFO: renamed from: a */
    public void m41026a(long j) {
        this.f39396e = j;
    }

    /* JADX INFO: renamed from: a */
    public void m41027a(String str) {
        this.f39399h = str;
    }

    /* JADX INFO: renamed from: a */
    public void m41028a(boolean z) {
        this.f39398g = z;
    }

    /* JADX INFO: renamed from: b */
    public void m41029b(int i) {
        this.f39394c = i;
    }

    /* JADX INFO: renamed from: b */
    public void m41030b(boolean z) {
        this.f39397f = z;
    }

    /* JADX INFO: renamed from: d */
    public C13818e m41031d() {
        return this.f39392a;
    }

    /* JADX INFO: renamed from: g */
    public long m41032g() {
        return this.f39396e;
    }

    /* JADX INFO: renamed from: h */
    public int m41033h() {
        return this.f39393b;
    }

    /* JADX INFO: renamed from: i */
    public String m41034i() {
        return this.f39399h;
    }

    /* JADX INFO: renamed from: j */
    public int m41035j() {
        return this.f39394c;
    }

    /* JADX INFO: renamed from: k */
    public String m41036k() {
        return this.f39395d;
    }

    /* JADX INFO: renamed from: l */
    public boolean m41037l() {
        return this.f39398g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m41038m() {
        return this.f39397f;
    }
}
