package com.example.earthquake.utility;

import java.util.HashMap;

public class Util {
    public static final HashMap<String, LatLng> COUNTRIES_LAT_LON = new HashMap<String, LatLng>() {{
        put("Andorra", new LatLng(42.546245, 1.601554,  150));
        put("United Arab Emirates", new LatLng(23.424076, 53.847818,  800));
        put("Afghanistan", new LatLng(33.93911, 67.709953,  1000));
        put("Antigua and Barbuda", new LatLng(17.060816, -61.796428,  500));
        put("Anguilla", new LatLng(18.220554, -63.068615,  500));
        put("Albania", new LatLng(41.153332, 20.168331,  500));
        put("Armenia", new LatLng(40.069099, 45.038189,  500));
        put("Netherlands Antilles", new LatLng(12.226079, -69.060087,  1200));
        put("Angola", new LatLng(-11.202692, 17.873887,  1700));
        put("Antarctica", new LatLng(-75.250973, -0.071389,  2150));
        put("Argentina", new LatLng(-38.416097, -63.616672,  2150));
        put("American Samoa", new LatLng(-14.270972, -170.132217,  500));
        put("Austria", new LatLng(47.516231, 14.550072,  800));
        put("Australia", new LatLng(-25.274398, 133.775136,  2150));
        put("Aruba", new LatLng(12.52111, -69.968338,  1200));
        put("Azerbaijan", new LatLng(40.143105, 47.576927,  1200));
        put("Bosnia and Herzegovina", new LatLng(43.915886, 17.679076,  1200));
        put("Barbados", new LatLng(13.193887, -59.543198,  1200));
        put("Bangladesh", new LatLng(23.684994, 90.356331,  1200));
        put("Belgium", new LatLng(50.503887, 4.469936,  1200));
        put("Burkina Faso", new LatLng(12.238333, -1.561593,  1200));
        put("Bulgaria", new LatLng(42.733883, 25.48583,  1200));
        put("Bahrain", new LatLng(25.930414, 50.637772,  1200));
        put("Burundi", new LatLng(-3.373056, 29.918886,  1200));
        put("Benin", new LatLng(9.30769, 2.315834,  1200));
        put("Bermuda", new LatLng(32.321384, -64.75737,  1200));
        put("Brunei", new LatLng(4.535277, 114.727669,  1200));
        put("Bolivia", new LatLng(-16.290154, -63.588653,  1200));
        put("Brazil", new LatLng(-14.235004, -51.92528,  1200));//, 2150,  1200));
        put("Bahamas", new LatLng(25.03428, -77.39628,  1200));
        put("Bhutan", new LatLng(27.514162, 90.433601,  1200));
        put("Bouvet Island", new LatLng(-54.423199, 3.413194,  1200));
        put("Botswana", new LatLng(-22.328474, 24.684866,  1200));
        put("Belarus", new LatLng(53.709807, 27.953389,  1200));
        put("Belize", new LatLng(17.189877, -88.49765,  1200));
        put("Canada", new LatLng(56.130366, -106.346771,  2150));
        put("Cocos Islands", new LatLng(-12.164165, 96.870956,  1200));
        put("Congo", new LatLng(-0.228021, 21.758664,  1200));
        put("Central African Republic", new LatLng(6.611111, 20.939444,  1200));
        put("Switzerland", new LatLng(46.818188, 8.227512,  1200));
        put("Côte d'Ivoire", new LatLng(7.539989, -5.54708,  1200));
        put("Cook Islands", new LatLng(-21.236736, -159.777671,  1200));
        put("Chile", new LatLng(-35.675147, -71.542969,  2150));
        put("Cameroon", new LatLng(7.369722, 12.354722,  1200));
        put("China", new LatLng(35.86166, 104.195397,  2150));
        put("Colombia", new LatLng(4.570868, -74.297333,  1200));
        put("Costa Rica", new LatLng(9.748917, -83.753428,  1200));
        put("Cuba", new LatLng(21.521757, -77.781167,  1200));
        put("Cape Verde", new LatLng(16.002082, -24.013197,  1200));
        put("Christmas Island", new LatLng(-10.447525, 105.690449,  1200));
        put("Cyprus", new LatLng(35.126413, 33.429859,  1200));
        put("Czech Republic", new LatLng(49.817492, 15.472962,  1200));
        put("Germany", new LatLng(51.165691, 10.451526,  1200));
        put("Djibouti", new LatLng(11.825138, 42.590275,  1200));
        put("Denmark", new LatLng(56.26392, 9.501785,  1200));
        put("Dominica", new LatLng(15.414999, -61.370976,  1200));
        put("Dominican Republic", new LatLng(18.735693, -70.162651,  1200));
        put("Algeria", new LatLng(28.033886, 1.659626,  1200));
        put("Ecuador", new LatLng(-1.831239, -78.183406,  1200));
        put("Estonia", new LatLng(58.595272, 25.013607,  1200));
        put("Egypt", new LatLng(26.820553, 30.802498,  1200));
        put("Western Sahara", new LatLng(24.215527, -12.885834,  1200));
        put("Eritrea", new LatLng(15.179384, 39.782334,  1200));
        put("Spain", new LatLng(40.463667, -3.74922,  1200));
        put("Ethiopia", new LatLng(9.145, 40.489673,  1200));
        put("Finland", new LatLng(61.92411, 25.748151,  1200));
        put("Fiji", new LatLng(-16.578193, 179.414413,  1200));
        put("Falkland Islands", new LatLng(-51.796253, -59.523613,  1200));
        put("Micronesia", new LatLng(7.425554, 150.550812,  1200));
        put("Faroe Islands", new LatLng(61.892635, -6.911806,  1200));
        put("France", new LatLng(46.227638, 2.213749,  1200));
        put("Gabon", new LatLng(-0.803689, 11.609444,  1200));
        put("United Kingdom", new LatLng(55.378051, -3.435973,  1200));
        put("Grenada", new LatLng(12.262776, -61.604171,  1200));
        put("Georgia", new LatLng(42.315407, 43.356892,  1200));
        put("French Guiana", new LatLng(3.933889, -53.125782,  1200));
        put("Guernsey", new LatLng(49.465691, -2.585278,  1200));
        put("Ghana", new LatLng(7.946527, -1.023194,  1200));
        put("Gibraltar", new LatLng(36.137741, -5.345374,  1200));
        put("Greenland", new LatLng(71.706936, -42.604303,  1200));
        put("Gambia", new LatLng(13.443182, -15.310139,  1200));
        put("Guinea", new LatLng(9.945587, -9.696645,  1200));
        put("Guadeloupe", new LatLng(16.995971, -62.067641,  1200));
        put("Equatorial Guinea", new LatLng(1.650801, 10.267895,  1200));
        put("Greece", new LatLng(39.074208, 21.824312,  1200));
        put("South Georgia and the South Sandwich Islands", new LatLng(-54.429579, -36.587909,  1200));
        put("Guatemala", new LatLng(15.783471, -90.230759,  1200));
        put("Guam", new LatLng(13.444304, 144.793731,  1200));
        put("Guinea-Bissau", new LatLng(11.803749, -15.180413,  1200));
        put("Guyana", new LatLng(4.860416, -58.93018,  1200));
        put("Gaza Strip", new LatLng(31.354676, 34.308825,  1200));
        put("Hong Kong", new LatLng(22.396428, 114.109497,  1200));
        put("Heard Island and McDonald Islands", new LatLng(-53.08181, 73.504158,  1200));
        put("Honduras", new LatLng(15.199999, -86.241905,  1200));
        put("Croatia", new LatLng(45.1, 15.2,  1200));
        put("Haiti", new LatLng(18.971187, -72.285215,  1200));
        put("Hungary", new LatLng(47.162494, 19.503304,  1200));
        put("Indonesia", new LatLng(-0.789275, 113.921327,  1200));
        put("Ireland", new LatLng(53.41291, -8.24389,  1200));
        put("Israel", new LatLng(31.046051, 34.851612,  1200));
        put("Isle of Man", new LatLng(54.236107, -4.548056,  1200));
        put("India", new LatLng(20.593684, 78.96288,  2150));//, 2150,  1200));
        put("British Indian Ocean Territory", new LatLng(-6.343194, 71.876519,  1200));
        put("Iraq", new LatLng(33.223191, 43.679291,  1200));
        put("Iran", new LatLng(32.427908, 53.688046,  1200));
        put("Iceland", new LatLng(64.963051, -19.020835,  1200));
        put("Italy", new LatLng(41.87194, 12.56738,  1200));
        put("Jersey", new LatLng(49.214439, -2.13125,  1200));
        put("Jamaica", new LatLng(18.109581, -77.297508,  1200));
        put("Jordan", new LatLng(30.585164, 36.238414,  1200));
        put("Japan", new LatLng(36.204824, 138.252924,  1200));
        put("Kenya", new LatLng(-0.023559, 37.906193,  1200));
        put("Kyrgyzstan", new LatLng(41.20438, 74.766098,  1200));
        put("Cambodia", new LatLng(12.565679, 104.990963,  1200));
        put("Kiribati", new LatLng(-3.370417, -168.734039,  1200));
        put("Comoros", new LatLng(-11.875001, 43.872219,  1200));
        put("Saint Kitts and Nevis", new LatLng(17.357822, -62.782998,  1200));
        put("North Korea", new LatLng(40.339852, 127.510093,  1200));
        put("South Korea", new LatLng(35.907757, 127.766922,  1200));
        put("Kuwait", new LatLng(29.31166, 47.481766,  1200));
        put("Cayman Islands", new LatLng(19.513469, -80.566956,  1200));
        put("Kazakhstan", new LatLng(48.019573, 66.923684,  1200));
        put("Laos", new LatLng(19.85627, 102.495496,  1200));
        put("Lebanon", new LatLng(33.854721, 35.862285,  1200));
        put("Saint Lucia", new LatLng(13.909444, -60.978893,  1200));
        put("Liechtenstein", new LatLng(47.166, 9.555373,  1200));
        put("Sri Lanka", new LatLng(7.873054, 80.771797,  1200));
        put("Liberia", new LatLng(6.428055, -9.429499,  1200));
        put("Lesotho", new LatLng(-29.609988, 28.233608,  1200));
        put("Lithuania", new LatLng(55.169438, 23.881275,  1200));
        put("Luxembourg", new LatLng(49.815273, 6.129583,  1200));
        put("Latvia", new LatLng(56.879635, 24.603189,  1200));
        put("Libya", new LatLng(26.3351, 17.228331,  1200));
        put("Morocco", new LatLng(31.791702, -7.09262,  1200));
        put("Monaco", new LatLng(43.750298, 7.412841,  1200));
        put("Moldova", new LatLng(47.411631, 28.369885,  1200));
        put("Montenegro", new LatLng(42.708678, 19.37439,  1200));
        put("Madagascar", new LatLng(-18.766947, 46.869107,  1200));
        put("Marshall Islands", new LatLng(7.131474, 171.184478,  1200));
        put("Macedonia", new LatLng(41.608635, 21.745275,  1200));
        put("Mali", new LatLng(17.570692, -3.996166,  1200));
        put("Myanmar", new LatLng(21.913965, 95.956223,  1200));
        put("Mongolia", new LatLng(46.862496, 103.846656,  1200));
        put("Macau", new LatLng(22.198745, 113.543873,  1200));
        put("Northern Mariana Islands", new LatLng(17.33083, 145.38469,  1200));
        put("Martinique", new LatLng(14.641528, -61.024174,  1200));
        put("Mauritania", new LatLng(21.00789, -10.940835,  1200));
        put("Montserrat", new LatLng(16.742498, -62.187366,  1200));
        put("Malta", new LatLng(35.937496, 14.375416,  1200));
        put("Mauritius", new LatLng(-20.348404, 57.552152,  1200));
        put("Maldives", new LatLng(3.202778, 73.22068,  1200));
        put("Malawi", new LatLng(-13.254308, 34.301525,  1200));
        put("Mexico", new LatLng(23.634501, -102.552784,  2000));
        put("Malaysia", new LatLng(4.210484, 101.975766,  1200));
        put("Mozambique", new LatLng(-18.665695, 35.529562,  1200));
        put("Namibia", new LatLng(-22.95764, 18.49041,  1200));
        put("New Caledonia", new LatLng(-20.904305, 165.618042,  1200));
        put("Niger", new LatLng(17.607789, 8.081666,  1200));
        put("Norfolk Island", new LatLng(-29.040835, 167.954712,  1200));
        put("Nigeria", new LatLng(9.081999, 8.675277,  1200));
        put("Nicaragua", new LatLng(12.865416, -85.207229,  1200));
        put("Netherlands", new LatLng(52.132633, 5.291266,  1200));
        put("Norway", new LatLng(60.472024, 8.468946,  1200));
        put("Nepal", new LatLng(28.394857, 84.124008,  1200));
        put("Nauru", new LatLng(-0.522778, 166.931503,  1200));
        put("Niue", new LatLng(-19.054445, -169.867233,  1200));
        put("New Zealand", new LatLng(-40.900557, 174.885971,  1200));
        put("Oman", new LatLng(21.512583, 55.923255,  1200));
        put("Panama", new LatLng(8.537981, -80.782127,  1200));
        put("Peru", new LatLng(-9.189967, -75.015152,  1200));
        put("French Polynesia", new LatLng(-17.679742, -149.406843,  1200));
        put("Papua New Guinea", new LatLng(-6.314993, 143.95555,  1200));
        put("Philippines", new LatLng(12.879721, 121.774017,  1200));
        put("Pakistan", new LatLng(30.375321, 69.345116,  1200));
        put("Poland", new LatLng(51.919438, 19.145136,  1200));
        put("Saint Pierre and Miquelon", new LatLng(46.941936, -56.27111,  1200));
        put("Pitcairn Islands", new LatLng(-24.703615, -127.439308,  1200));
        put("Puerto Rico", new LatLng(18.220833, -66.590149,  1200));
        put("Palestine", new LatLng(31.952162, 35.233154,  1200));
        put("Portugal", new LatLng(39.399872, -8.224454,  1200));
        put("Palau", new LatLng(7.51498, 134.58252,  1200));
        put("Paraguay", new LatLng(-23.442503, -58.443832,  1200));
        put("Qatar", new LatLng(25.354826, 51.183884,  1200));
        put("Réunion", new LatLng(-21.115141, 55.536384,  1200));
        put("Romania", new LatLng(45.943161, 24.96676,  1200));
        put("Serbia", new LatLng(44.016521, 21.005859,  1200));
        put("Russia", new LatLng(61.52401, 105.318756,  2150));//, 2150,  1200));
        put("Rwanda", new LatLng(-1.940278, 29.873888,  1200));
        put("Saudi Arabia", new LatLng(23.885942, 45.079162,  1200));
        put("Solomon Islands", new LatLng(-9.64571, 160.156194,  1200));
        put("Seychelles", new LatLng(-4.679574, 55.491977,  1200));
        put("Sudan", new LatLng(12.862807, 30.217636,  1200));
        put("Sweden", new LatLng(60.128161, 18.643501,  1200));
        put("Singapore", new LatLng(1.352083, 103.819836,  1200));
        put("Saint Helena", new LatLng(-24.143474, -10.030696,  1200));
        put("Slovenia", new LatLng(46.151241, 14.995463,  1200));
        put("Svalbard and Jan Mayen", new LatLng(77.553604, 23.670272,  1200));
        put("Slovakia", new LatLng(48.669026, 19.699024,  1200));
        put("Sierra Leone", new LatLng(8.460555, -11.779889,  1200));
        put("San Marino", new LatLng(43.94236, 12.457777,  1200));
        put("Senegal", new LatLng(14.497401, -14.452362,  1200));
        put("Somalia", new LatLng(5.152149, 46.199616,  1200));
        put("Suriname", new LatLng(3.919305, -56.027783,  1200));
        put("São Tomé and Príncipe", new LatLng(0.18636, 6.613081,  1200));
        put("El Salvador", new LatLng(13.794185, -88.89653,  1200));
        put("Syria", new LatLng(34.802075, 38.996815,  1200));
        put("Swaziland", new LatLng(-26.522503, 31.465866,  1200));
        put("Turks and Caicos Islands", new LatLng(21.694025, -71.797928,  1200));
        put("Chad", new LatLng(15.454166, 18.732207,  1200));
        put("French Southern Territories", new LatLng(-49.280366, 69.348557,  1200));
        put("Togo", new LatLng(8.619543, 0.824782,  1200));
        put("Thailand", new LatLng(15.870032, 100.992541,  1200));
        put("Tajikistan", new LatLng(38.861034, 71.276093,  1200));
        put("Tokelau", new LatLng(-8.967363, -171.855881,  1200));
        put("Timor-Leste", new LatLng(-8.874217, 125.727539,  1200));
        put("Turkmenistan", new LatLng(38.969719, 59.556278,  1200));
        put("Tunisia", new LatLng(33.886917, 9.537499,  1200));
        put("Tonga", new LatLng(-21.178986, -175.198242,  1200));
        put("Turkey", new LatLng(38.963745, 35.243322,  1200));//, 1200,  1200));
        put("Trinidad and Tobago", new LatLng(10.691803, -61.222503,  1200));
        put("Tuvalu", new LatLng(-7.109535, 177.64933,  1200));
        put("Taiwan", new LatLng(23.69781, 120.960515,  1200));
        put("Tanzania", new LatLng(-6.369028, 34.888822,  1200));
        put("Ukraine", new LatLng(48.379433, 31.16558,  1200));
        put("Uganda", new LatLng(1.373333, 32.290275,  1200));
        put("United States", new LatLng(37.09024,-95.712891,  2150));
        put("Uruguay", new LatLng(-32.522779, -55.765835,  1200));
        put("Uzbekistan", new LatLng(41.377491, 64.585262,  1200));
        put("Vatican City", new LatLng(41.902916, 12.453389,  1200));
        put("Saint Vincent and the Grenadines", new LatLng(12.984305, -61.287228,  1200));
        put("Venezuela", new LatLng(6.42375, -66.58973,  1200));
        put("Virgin Islands", new LatLng(18.335765, -64.896335,  500));
        put("Vietnam", new LatLng(14.058324, 108.277199,  1200));
        put("Vanuatu", new LatLng(-15.376706, 166.959158,  1200));
        put("Wallis and Futuna", new LatLng(-13.768752, -177.156097,  1200));
        put("Samoa", new LatLng(-13.759029, -172.104629,  1200));
        put("Kosovo", new LatLng(42.602636, 20.902977,  1200));
        put("Yemen", new LatLng(15.552727, 48.516388,  1200));
        put("Mayotte", new LatLng(-12.8275, 45.166244,  1200));
        put("South Africa", new LatLng(-30.559482, 22.937506,  1200));
        put("Zambia", new LatLng(-13.133897, 27.849332,  1200));
        put("Zimbabwe", new LatLng(-19.015438, 29.154857,  1200));
    }};

    public static final String[] statesInUsa = {
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York",
            "North Carolina",
            "North Dakota",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "Rhode Island",
            "South Carolina",
            "South Dakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wisconsin",
            "Wyoming"
    };

    public static String capitalizeFirstLetter(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static boolean stateControl(String str){
        boolean check = false;
        for (String s : statesInUsa) {
            if (str.contains(s.toLowerCase())) {
                check = true;
                break;
            }
        }
        return check;
    }

}
