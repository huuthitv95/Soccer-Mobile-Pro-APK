package com.fyber.inneractive.sdk.protobuf;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.h3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8950h3 {
    /* JADX INFO: renamed from: a */
    public static String m21620a(AbstractC9011s abstractC9011s) {
        StringBuilder sb = new StringBuilder(abstractC9011s.size());
        for (int i = 0; i < abstractC9011s.size(); i++) {
            byte bMo21669c = abstractC9011s.mo21669c(i);
            if (bMo21669c == 34) {
                sb.append("\\\"");
            } else if (bMo21669c == 39) {
                sb.append("\\'");
            } else if (bMo21669c != 92) {
                switch (bMo21669c) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo21669c < 32 || bMo21669c > 126) {
                            sb.append(AbstractJsonLexerKt.STRING_ESC);
                            sb.append((char) (((bMo21669c >>> 6) & 3) + 48));
                            sb.append((char) (((bMo21669c >>> 3) & 7) + 48));
                            sb.append((char) ((bMo21669c & 7) + 48));
                        } else {
                            sb.append((char) bMo21669c);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
