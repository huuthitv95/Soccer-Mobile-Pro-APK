package com.tiktok.util;

import android.util.Log;
import com.tiktok.TikTokBusinessSdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class TTLogger {
    public final TikTokBusinessSdk.LogLevel logLevel;
    private final String tag;

    public TTLogger(String tag, TikTokBusinessSdk.LogLevel logLevel) {
        this.tag = wrapTag(tag);
        this.logLevel = logLevel;
    }

    private String resolvedStr(String format, Object... extra) {
        if (format == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return extra.length == 0 ? format : String.format(format, extra);
    }

    private boolean shouldLog(TikTokBusinessSdk.LogLevel level) {
        return this.logLevel.ordinal() >= level.ordinal();
    }

    private String wrapTag(String tag) {
        StringBuilder sb = new StringBuilder("TTSDK-");
        if (tag == null) {
            tag = "";
        }
        sb.append(tag);
        return sb.toString();
    }

    public void debug(String format, Object... extra) {
        if (shouldLog(TikTokBusinessSdk.LogLevel.DEBUG)) {
            String strResolvedStr = resolvedStr(format, extra);
            if (strResolvedStr.length() <= 1000) {
                Log.d(this.tag, strResolvedStr);
            } else {
                Log.d(this.tag, strResolvedStr.substring(0, 1000));
                debug(strResolvedStr.substring(1000), new Object[0]);
            }
        }
    }

    public void error(Throwable error, String format, Object... extra) {
        if (shouldLog(TikTokBusinessSdk.LogLevel.INFO)) {
            Log.e(this.tag, resolvedStr(format, extra), error);
        }
    }

    public void info(String format, Object... extra) {
        if (shouldLog(TikTokBusinessSdk.LogLevel.INFO)) {
            String strResolvedStr = resolvedStr(format, extra);
            if (strResolvedStr.length() <= 1000) {
                Log.i(this.tag, strResolvedStr);
            } else {
                Log.i(this.tag, strResolvedStr.substring(0, 1000));
                info(strResolvedStr.substring(1000), new Object[0]);
            }
        }
    }

    public void warn(String format, Object... extra) {
        if (shouldLog(TikTokBusinessSdk.LogLevel.WARN)) {
            Log.w(this.tag, resolvedStr(format, extra));
        }
    }
}
