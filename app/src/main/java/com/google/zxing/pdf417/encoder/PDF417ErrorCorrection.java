package com.google.zxing.pdf417.encoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.internal.ViewUtils;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, TTAdConstant.STYLE_SIZE_RADIO_9_16, 232, 755, CommonGatewayClient.CODE_599, IronSourceError.ERROR_PLACEMENT_CAPPED, 801, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, IronSourceError.ERROR_AD_FORMAT_CAPPED, 176, 586, 640, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 803, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 231, 390, 685, 330, 63, 410}, new int[]{539, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 6, 93, 862, 771, 453, 106, 610, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, FrameMetricsAggregator.EVERY_DURATION, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 4, 381, 843, IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, TTAdConstant.VIDEO_COVER_URL_CODE, 822, 93, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 246, 148, 447, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 129, 186, 236, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 192, 775, 278, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 40, 379, IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, 378, 382, 262, 380, 602, 754, 336, 89, IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, 87, 432, 670, IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{IronSourceError.ERROR_PLACEMENT_CAPPED, 894, 75, 766, 882, 857, 74, 204, 82, 586, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, TypedValues.Custom.TYPE_DIMENSION, 786, 138, 720, 858, 194, 311, 913, 275, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 257, 284, 549, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 19, 358, 399, 908, 103, FrameMetricsAggregator.EVERY_DURATION, 51, 8, 517, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, TypedValues.Custom.TYPE_REFERENCE, 90, 2, 290, 743, 199, 655, TypedValues.Custom.TYPE_STRING, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, CommonGatewayClient.CODE_599, 428, 207, 409, 574, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 435, 543, 203, TTAdConstant.STYLE_SIZE_RADIO_2_3, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 536, 561, 76, 653, 899, 729, 567, 744, 390, InputDeviceCompat.SOURCE_DPAD, 192, 516, 258, 240, 518, 794, 395, ViewUtils.EDGE_TO_EDGE_FLAGS, 848, 51, 610, 384, 168, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 826, 328, 596, 786, 303, 570, 381, TTAdConstant.VIDEO_COVER_URL_CODE, 641, 156, 237, 151, CommonGatewayClient.CODE_TOO_MANY_REQUESTS, 531, 207, 676, 710, 89, 168, 304, 402, 40, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, TypedValues.Custom.TYPE_COLOR, 452, 167, 342, 244, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 662, 777, 475, 850, 764, 364, 578, 911, 283, IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, 472, TypedValues.CycleType.TYPE_EASING, 245, 288, 594, 394, FrameMetricsAggregator.EVERY_DURATION, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 59, 193, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 158, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 410, 579, 870, IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 841, 632, 860, 289, 536, 35, 777, 618, 586, TypedValues.CycleType.TYPE_WAVE_OFFSET, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, 830, 922, 437, 519, 644, TypedValues.Custom.TYPE_DIMENSION, 789, TypedValues.CycleType.TYPE_EASING, 305, 441, 207, 300, 892, 827, ModuleDescriptor.MODULE_VERSION, 537, 381, 662, InputDeviceCompat.SOURCE_DPAD, 56, 252, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 242, 797, 838, 837, 720, 224, 307, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, TypedValues.CycleType.TYPE_WAVE_PHASE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 548, 249, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 881, 699, 535, 673, 782, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 815, TypedValues.Custom.TYPE_DIMENSION, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 907, 817, 187, 62, 16, TypedValues.CycleType.TYPE_WAVE_PHASE, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, TypedValues.CycleType.TYPE_WAVE_OFFSET, 242, 749, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 464, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 531, 297, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, ModuleDescriptor.MODULE_VERSION, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, ViewUtils.EDGE_TO_EDGE_FLAGS, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 303, 263}};

    private PDF417ErrorCorrection() {
    }

    static int getErrorCorrectionCodewordCount(int i) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i + 1);
    }

    static int getRecommendedMinimumErrorCorrectionLevel(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i <= 40) {
            return 2;
        }
        if (i <= 160) {
            return 3;
        }
        if (i <= 320) {
            return 4;
        }
        if (i <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }

    static String generateErrorCorrection(CharSequence charSequence, int i) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = errorCorrectionCodewordCount - 1;
            int iCharAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((EC_COEFFICIENTS[i][i3] * iCharAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * EC_COEFFICIENTS[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i4 = errorCorrectionCodewordCount - 1; i4 >= 0; i4--) {
            char c = cArr[i4];
            if (c != 0) {
                cArr[i4] = (char) (929 - c);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }
}
