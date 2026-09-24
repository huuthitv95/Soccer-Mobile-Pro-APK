package com.ironsource.mediationsdk.logger;

import com.ironsource.C12151db;

/* JADX INFO: loaded from: classes6.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* JADX INFO: renamed from: a */
    IronSourceLogger.IronSourceTag f31295a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f31295a = ironSourceTag;
    }

    public void error(String str, Throwable th) {
        IronSourceLoggerManager.getLogger().m32573a(this.f31295a, new C12151db(str, 3), th);
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db(str, 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db("", 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().m32572a(this.f31295a, new C12151db("", 3));
    }
}
