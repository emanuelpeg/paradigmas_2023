// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {

  import NumberToChineseWords._

  test(" 30 => 參拾 ") {
    assert(format(30) == "參拾")
  }

  test(" 33000 => 參萬參仟 ") {
    assert(format(33000) == "參萬參仟")
  }

  test(" 25 => 貳拾伍 ") {
    assert(format(25) == "貳拾伍")
  }

  test(" 301 => 參佰壹 ") {
    assert(format(301) == "參佰壹")
  }
  test(" 302 => 參佰貳 ") {
    assert(format(302) == "參佰貳")
  }
  test(" 303 => 參佰參 ") {
    assert(format(303) == "參佰參")
  }
  test(" 304 => 參佰肆 ") {
    assert(format(304) == "參佰肆")
  }
  test(" 305 => 參佰伍 ") {
    assert(format(305) == "參佰伍")
  }
  test(" 306 => 參佰陸 ") {
    assert(format(306) == "參佰陸")
  }
  test(" 307 => 參佰柒 ") {
    assert(format(307) == "參佰柒")
  }
  test(" 308 => 參佰捌 ") {
    assert(format(308) == "參佰捌")
  }
  test(" 309 => 參佰玖 ") {
    assert(format(309) == "參佰玖")
  }
  test(" 310 => 參佰壹拾 ") {
    assert(format(310) == "參佰壹拾")
  }
  test(" 311 => 參佰壹拾壹 ") {
    assert(format(311) == "參佰壹拾壹")
  }
  test(" 312 => 參佰壹拾貳 ") {
    assert(format(312) == "參佰壹拾貳")
  }
  test(" 313 => 參佰壹拾參 ") {
    assert(format(313) == "參佰壹拾參")
  }
  test(" 314 => 參佰壹拾肆 ") {
    assert(format(314) == "參佰壹拾肆")
  }
  test(" 315 => 參佰壹拾伍 ") {
    assert(format(315) == "參佰壹拾伍")
  }
  test(" 316 => 參佰壹拾陸 ") {
    assert(format(316) == "參佰壹拾陸")
  }
  test(" 317 => 參佰壹拾柒 ") {
    assert(format(317) == "參佰壹拾柒")
  }
  test(" 318 => 參佰壹拾捌 ") {
    assert(format(318) == "參佰壹拾捌")
  }
  test(" 319 => 參佰壹拾玖 ") {
    assert(format(319) == "參佰壹拾玖")
  }
  test(" 320 => 參佰貳拾 ") {
    assert(format(320) == "參佰貳拾")
  }
  test(" 321 => 參佰貳拾壹 ") {
    assert(format(321) == "參佰貳拾壹")
  }
  test(" 322 => 參佰貳拾貳 ") {
    assert(format(322) == "參佰貳拾貳")
  }
  test(" 323 => 參佰貳拾參 ") {
    assert(format(323) == "參佰貳拾參")
  }
  test(" 324 => 參佰貳拾肆 ") {
    assert(format(324) == "參佰貳拾肆")
  }
  test(" 325 => 參佰貳拾伍 ") {
    assert(format(325) == "參佰貳拾伍")
  }
  test(" 326 => 參佰貳拾陸 ") {
    assert(format(326) == "參佰貳拾陸")
  }
  test(" 327 => 參佰貳拾柒 ") {
    assert(format(327) == "參佰貳拾柒")
  }
  test(" 328 => 參佰貳拾捌 ") {
    assert(format(328) == "參佰貳拾捌")
  }
  test(" 329 => 參佰貳拾玖 ") {
    assert(format(329) == "參佰貳拾玖")
  }
  test(" 330 => 參佰參拾 ") {
    assert(format(330) == "參佰參拾")
  }
  test(" 331 => 參佰參拾壹 ") {
    assert(format(331) == "參佰參拾壹")
  }
  test(" 332 => 參佰參拾貳 ") {
    assert(format(332) == "參佰參拾貳")
  }
  test(" 333 => 參佰參拾參 ") {
    assert(format(333) == "參佰參拾參")
  }
  test(" 334 => 參佰參拾肆 ") {
    assert(format(334) == "參佰參拾肆")
  }
  test(" 335 => 參佰參拾伍 ") {
    assert(format(335) == "參佰參拾伍")
  }
  test(" 336 => 參佰參拾陸 ") {
    assert(format(336) == "參佰參拾陸")
  }
  test(" 337 => 參佰參拾柒 ") {
    assert(format(337) == "參佰參拾柒")
  }
  test(" 338 => 參佰參拾捌 ") {
    assert(format(338) == "參佰參拾捌")
  }
  test(" 339 => 參佰參拾玖 ") {
    assert(format(339) == "參佰參拾玖")
  }
  test(" 340 => 參佰肆拾 ") {
    assert(format(340) == "參佰肆拾")
  }
  test(" 341 => 參佰肆拾壹 ") {
    assert(format(341) == "參佰肆拾壹")
  }
  test(" 342 => 參佰肆拾貳 ") {
    assert(format(342) == "參佰肆拾貳")
  }
  test(" 343 => 參佰肆拾參 ") {
    assert(format(343) == "參佰肆拾參")
  }
  test(" 344 => 參佰肆拾肆 ") {
    assert(format(344) == "參佰肆拾肆")
  }
  test(" 345 => 參佰肆拾伍 ") {
    assert(format(345) == "參佰肆拾伍")
  }
  test(" 346 => 參佰肆拾陸 ") {
    assert(format(346) == "參佰肆拾陸")
  }
  test(" 347 => 參佰肆拾柒 ") {
    assert(format(347) == "參佰肆拾柒")
  }
  test(" 348 => 參佰肆拾捌 ") {
    assert(format(348) == "參佰肆拾捌")
  }
  test(" 349 => 參佰肆拾玖 ") {
    assert(format(349) == "參佰肆拾玖")
  }
  test(" 350 => 參佰伍拾 ") {
    assert(format(350) == "參佰伍拾")
  }
  test(" 351 => 參佰伍拾壹 ") {
    assert(format(351) == "參佰伍拾壹")
  }
  test(" 352 => 參佰伍拾貳 ") {
    assert(format(352) == "參佰伍拾貳")
  }
  test(" 353 => 參佰伍拾參 ") {
    assert(format(353) == "參佰伍拾參")
  }
  test(" 354 => 參佰伍拾肆 ") {
    assert(format(354) == "參佰伍拾肆")
  }
  test(" 355 => 參佰伍拾伍 ") {
    assert(format(355) == "參佰伍拾伍")
  }
  test(" 356 => 參佰伍拾陸 ") {
    assert(format(356) == "參佰伍拾陸")
  }
  test(" 357 => 參佰伍拾柒 ") {
    assert(format(357) == "參佰伍拾柒")
  }
  test(" 358 => 參佰伍拾捌 ") {
    assert(format(358) == "參佰伍拾捌")
  }
  test(" 359 => 參佰伍拾玖 ") {
    assert(format(359) == "參佰伍拾玖")
  }
  test(" 360 => 參佰陸拾 ") {
    assert(format(360) == "參佰陸拾")
  }
  test(" 361 => 參佰陸拾壹 ") {
    assert(format(361) == "參佰陸拾壹")
  }
  test(" 362 => 參佰陸拾貳 ") {
    assert(format(362) == "參佰陸拾貳")
  }
  test(" 363 => 參佰陸拾參 ") {
    assert(format(363) == "參佰陸拾參")
  }
  test(" 364 => 參佰陸拾肆 ") {
    assert(format(364) == "參佰陸拾肆")
  }
  test(" 365 => 參佰陸拾伍 ") {
    assert(format(365) == "參佰陸拾伍")
  }
  test(" 366 => 參佰陸拾陸 ") {
    assert(format(366) == "參佰陸拾陸")
  }
  test(" 367 => 參佰陸拾柒 ") {
    assert(format(367) == "參佰陸拾柒")
  }
  test(" 368 => 參佰陸拾捌 ") {
    assert(format(368) == "參佰陸拾捌")
  }
  test(" 369 => 參佰陸拾玖 ") {
    assert(format(369) == "參佰陸拾玖")
  }
  test(" 370 => 參佰柒拾 ") {
    assert(format(370) == "參佰柒拾")
  }
  test(" 371 => 參佰柒拾壹 ") {
    assert(format(371) == "參佰柒拾壹")
  }
  test(" 372 => 參佰柒拾貳 ") {
    assert(format(372) == "參佰柒拾貳")
  }
  test(" 373 => 參佰柒拾參 ") {
    assert(format(373) == "參佰柒拾參")
  }
  test(" 374 => 參佰柒拾肆 ") {
    assert(format(374) == "參佰柒拾肆")
  }
  test(" 375 => 參佰柒拾伍 ") {
    assert(format(375) == "參佰柒拾伍")
  }
  test(" 376 => 參佰柒拾陸 ") {
    assert(format(376) == "參佰柒拾陸")
  }
  test(" 377 => 參佰柒拾柒 ") {
    assert(format(377) == "參佰柒拾柒")
  }
  test(" 378 => 參佰柒拾捌 ") {
    assert(format(378) == "參佰柒拾捌")
  }
  test(" 379 => 參佰柒拾玖 ") {
    assert(format(379) == "參佰柒拾玖")
  }
  test(" 380 => 參佰捌拾 ") {
    assert(format(380) == "參佰捌拾")
  }
  test(" 381 => 參佰捌拾壹 ") {
    assert(format(381) == "參佰捌拾壹")
  }
  test(" 382 => 參佰捌拾貳 ") {
    assert(format(382) == "參佰捌拾貳")
  }
  test(" 383 => 參佰捌拾參 ") {
    assert(format(383) == "參佰捌拾參")
  }
  test(" 384 => 參佰捌拾肆 ") {
    assert(format(384) == "參佰捌拾肆")
  }
  test(" 385 => 參佰捌拾伍 ") {
    assert(format(385) == "參佰捌拾伍")
  }
  test(" 386 => 參佰捌拾陸 ") {
    assert(format(386) == "參佰捌拾陸")
  }
  test(" 387 => 參佰捌拾柒 ") {
    assert(format(387) == "參佰捌拾柒")
  }
  test(" 388 => 參佰捌拾捌 ") {
    assert(format(388) == "參佰捌拾捌")
  }
  test(" 389 => 參佰捌拾玖 ") {
    assert(format(389) == "參佰捌拾玖")
  }
  test(" 390 => 參佰玖拾 ") {
    assert(format(390) == "參佰玖拾")
  }
  test(" 391 => 參佰玖拾壹 ") {
    assert(format(391) == "參佰玖拾壹")
  }
  test(" 392 => 參佰玖拾貳 ") {
    assert(format(392) == "參佰玖拾貳")
  }
  test(" 393 => 參佰玖拾參 ") {
    assert(format(393) == "參佰玖拾參")
  }
  test(" 394 => 參佰玖拾肆 ") {
    assert(format(394) == "參佰玖拾肆")
  }
  test(" 395 => 參佰玖拾伍 ") {
    assert(format(395) == "參佰玖拾伍")
  }
  test(" 396 => 參佰玖拾陸 ") {
    assert(format(396) == "參佰玖拾陸")
  }
  test(" 397 => 參佰玖拾柒 ") {
    assert(format(397) == "參佰玖拾柒")
  }
  test(" 398 => 參佰玖拾捌 ") {
    assert(format(398) == "參佰玖拾捌")
  }
  test(" 399 => 參佰玖拾玖 ") {
    assert(format(399) == "參佰玖拾玖")
  }
  test(" 400 => 肆佰 ") {
    assert(format(400) == "肆佰")
  }
  test(" 401 => 肆佰壹 ") {
    assert(format(401) == "肆佰壹")
  }

  test(" 90601 => 玖萬陸佰壹 ") {
    assert(format(90601) == "玖萬陸佰壹")
  }
  test(" 91204 => 玖萬壹仟貳佰肆 ") {
    assert(format(91204) == "玖萬壹仟貳佰肆")
  }
  test(" 91809 => 玖萬壹仟捌佰玖 ") {
    assert(format(91809) == "玖萬壹仟捌佰玖")
  }
  test(" 92416 => 玖萬貳仟肆佰壹拾陸 ") {
    assert(format(92416) == "玖萬貳仟肆佰壹拾陸")
  }
  test(" 93025 => 玖萬參仟貳拾伍 ") {
    assert(format(93025) == "玖萬參仟貳拾伍")
  }
  test(" 93636 => 玖萬參仟陸佰參拾陸 ") {
    assert(format(93636) == "玖萬參仟陸佰參拾陸")
  }
  test(" 94249 => 玖萬肆仟貳佰肆拾玖 ") {
    assert(format(94249) == "玖萬肆仟貳佰肆拾玖")
  }
  test(" 94864 => 玖萬肆仟捌佰陸拾肆 ") {
    assert(format(94864) == "玖萬肆仟捌佰陸拾肆")
  }
  test(" 95481 => 玖萬伍仟肆佰捌拾壹 ") {
    assert(format(95481) == "玖萬伍仟肆佰捌拾壹")
  }
  test(" 96100 => 玖萬陸仟壹佰 ") {
    assert(format(96100) == "玖萬陸仟壹佰")
  }
  test(" 96721 => 玖萬陸仟柒佰貳拾壹 ") {
    assert(format(96721) == "玖萬陸仟柒佰貳拾壹")
  }
  test(" 97344 => 玖萬柒仟參佰肆拾肆 ") {
    assert(format(97344) == "玖萬柒仟參佰肆拾肆")
  }
  test(" 97969 => 玖萬柒仟玖佰陸拾玖 ") {
    assert(format(97969) == "玖萬柒仟玖佰陸拾玖")
  }
  test(" 98596 => 玖萬捌仟伍佰玖拾陸 ") {
    assert(format(98596) == "玖萬捌仟伍佰玖拾陸")
  }
  test(" 99225 => 玖萬玖仟貳佰貳拾伍 ") {
    assert(format(99225) == "玖萬玖仟貳佰貳拾伍")
  }
  test(" 99856 => 玖萬玖仟捌佰伍拾陸 ") {
    assert(format(99856) == "玖萬玖仟捌佰伍拾陸")
  }
  test(" 100489 => 壹億肆佰捌拾玖 ") {
    assert(format(100489) == "壹億肆佰捌拾玖")
  }
  test(" 101124 => 壹億壹仟壹佰貳拾肆 ") {
    assert(format(101124) == "壹億壹仟壹佰貳拾肆")
  }
  test(" 101761 => 壹億壹仟柒佰陸拾壹 ") {
    assert(format(101761) == "壹億壹仟柒佰陸拾壹")
  }
  test(" 102400 => 壹億貳仟肆佰 ") {
    assert(format(102400) == "壹億貳仟肆佰")
  }
  test(" 103041 => 壹億參仟肆拾壹 ") {
    assert(format(103041) == "壹億參仟肆拾壹")
  }
  test(" 103684 => 壹億參仟陸佰捌拾肆 ") {
    assert(format(103684) == "壹億參仟陸佰捌拾肆")
  }
  test(" 104329 => 壹億肆仟參佰貳拾玖 ") {
    assert(format(104329) == "壹億肆仟參佰貳拾玖")
  }
  test(" 104976 => 壹億肆仟玖佰柒拾陸 ") {
    assert(format(104976) == "壹億肆仟玖佰柒拾陸")
  }
  test(" 105625 => 壹億伍仟陸佰貳拾伍 ") {
    assert(format(105625) == "壹億伍仟陸佰貳拾伍")
  }
  test(" 106276 => 壹億陸仟貳佰柒拾陸 ") {
    assert(format(106276) == "壹億陸仟貳佰柒拾陸")
  }
  test(" 106929 => 壹億陸仟玖佰貳拾玖 ") {
    assert(format(106929) == "壹億陸仟玖佰貳拾玖")
  }
  test(" 107584 => 壹億柒仟伍佰捌拾肆 ") {
    assert(format(107584) == "壹億柒仟伍佰捌拾肆")
  }
  test(" 108241 => 壹億捌仟貳佰肆拾壹 ") {
    assert(format(108241) == "壹億捌仟貳佰肆拾壹")
  }
  test(" 108900 => 壹億捌仟玖佰 ") {
    assert(format(108900) == "壹億捌仟玖佰")
  }
  test(" 109561 => 壹億玖仟伍佰陸拾壹 ") {
    assert(format(109561) == "壹億玖仟伍佰陸拾壹")
  }
  test(" 110224 => 壹億壹萬貳佰貳拾肆 ") {
    assert(format(110224) == "壹億壹萬貳佰貳拾肆")
  }
  test(" 110889 => 壹億壹萬捌佰捌拾玖 ") {
    assert(format(110889) == "壹億壹萬捌佰捌拾玖")
  }
  test(" 111556 => 壹億壹萬壹仟伍佰伍拾陸 ") {
    assert(format(111556) == "壹億壹萬壹仟伍佰伍拾陸")
  }
  test(" 112225 => 壹億壹萬貳仟貳佰貳拾伍 ") {
    assert(format(112225) == "壹億壹萬貳仟貳佰貳拾伍")
  }
  test(" 112896 => 壹億壹萬貳仟捌佰玖拾陸 ") {
    assert(format(112896) == "壹億壹萬貳仟捌佰玖拾陸")
  }
  test(" 113569 => 壹億壹萬參仟伍佰陸拾玖 ") {
    assert(format(113569) == "壹億壹萬參仟伍佰陸拾玖")
  }
  test(" 114244 => 壹億壹萬肆仟貳佰肆拾肆 ") {
    assert(format(114244) == "壹億壹萬肆仟貳佰肆拾肆")
  }
  test(" 114921 => 壹億壹萬肆仟玖佰貳拾壹 ") {
    assert(format(114921) == "壹億壹萬肆仟玖佰貳拾壹")
  }
  test(" 115600 => 壹億壹萬伍仟陸佰 ") {
    assert(format(115600) == "壹億壹萬伍仟陸佰")
  }
  test(" 116281 => 壹億壹萬陸仟貳佰捌拾壹 ") {
    assert(format(116281) == "壹億壹萬陸仟貳佰捌拾壹")
  }
  test(" 116964 => 壹億壹萬陸仟玖佰陸拾肆 ") {
    assert(format(116964) == "壹億壹萬陸仟玖佰陸拾肆")
  }
  test(" 117649 => 壹億壹萬柒仟陸佰肆拾玖 ") {
    assert(format(117649) == "壹億壹萬柒仟陸佰肆拾玖")
  }
  test(" 118336 => 壹億壹萬捌仟參佰參拾陸 ") {
    assert(format(118336) == "壹億壹萬捌仟參佰參拾陸")
  }
  test(" 119025 => 壹億壹萬玖仟貳拾伍 ") {
    assert(format(119025) == "壹億壹萬玖仟貳拾伍")
  }
  test(" 119716 => 壹億壹萬玖仟柒佰壹拾陸 ") {
    assert(format(119716) == "壹億壹萬玖仟柒佰壹拾陸")
  }
  test(" 120409 => 壹億貳萬肆佰玖 ") {
    assert(format(120409) == "壹億貳萬肆佰玖")
  }
  test(" 121104 => 壹億貳萬壹仟壹佰肆 ") {
    assert(format(121104) == "壹億貳萬壹仟壹佰肆")
  }
  test(" 121801 => 壹億貳萬壹仟捌佰壹 ") {
    assert(format(121801) == "壹億貳萬壹仟捌佰壹")
  }
  test(" 122500 => 壹億貳萬貳仟伍佰 ") {
    assert(format(122500) == "壹億貳萬貳仟伍佰")
  }
  test(" 123201 => 壹億貳萬參仟貳佰壹 ") {
    assert(format(123201) == "壹億貳萬參仟貳佰壹")
  }
  test(" 123904 => 壹億貳萬參仟玖佰肆 ") {
    assert(format(123904) == "壹億貳萬參仟玖佰肆")
  }
  test(" 124609 => 壹億貳萬肆仟陸佰玖 ") {
    assert(format(124609) == "壹億貳萬肆仟陸佰玖")
  }
  test(" 125316 => 壹億貳萬伍仟參佰壹拾陸 ") {
    assert(format(125316) == "壹億貳萬伍仟參佰壹拾陸")
  }
  test(" 126025 => 壹億貳萬陸仟貳拾伍 ") {
    assert(format(126025) == "壹億貳萬陸仟貳拾伍")
  }
  test(" 126736 => 壹億貳萬陸仟柒佰參拾陸 ") {
    assert(format(126736) == "壹億貳萬陸仟柒佰參拾陸")
  }
  test(" 127449 => 壹億貳萬柒仟肆佰肆拾玖 ") {
    assert(format(127449) == "壹億貳萬柒仟肆佰肆拾玖")
  }
  test(" 128164 => 壹億貳萬捌仟壹佰陸拾肆 ") {
    assert(format(128164) == "壹億貳萬捌仟壹佰陸拾肆")
  }
  test(" 128881 => 壹億貳萬捌仟捌佰捌拾壹 ") {
    assert(format(128881) == "壹億貳萬捌仟捌佰捌拾壹")
  }
  test(" 129600 => 壹億貳萬玖仟陸佰 ") {
    assert(format(129600) == "壹億貳萬玖仟陸佰")
  }
  test(" 130321 => 壹億參萬參佰貳拾壹 ") {
    assert(format(130321) == "壹億參萬參佰貳拾壹")
  }
  test(" 131044 => 壹億參萬壹仟肆拾肆 ") {
    assert(format(131044) == "壹億參萬壹仟肆拾肆")
  }
  test(" 131769 => 壹億參萬壹仟柒佰陸拾玖 ") {
    assert(format(131769) == "壹億參萬壹仟柒佰陸拾玖")
  }
  test(" 132496 => 壹億參萬貳仟肆佰玖拾陸 ") {
    assert(format(132496) == "壹億參萬貳仟肆佰玖拾陸")
  }
  test(" 133225 => 壹億參萬參仟貳佰貳拾伍 ") {
    assert(format(133225) == "壹億參萬參仟貳佰貳拾伍")
  }
  test(" 133956 => 壹億參萬參仟玖佰伍拾陸 ") {
    assert(format(133956) == "壹億參萬參仟玖佰伍拾陸")
  }
  test(" 134689 => 壹億參萬肆仟陸佰捌拾玖 ") {
    assert(format(134689) == "壹億參萬肆仟陸佰捌拾玖")
  }
  test(" 135424 => 壹億參萬伍仟肆佰貳拾肆 ") {
    assert(format(135424) == "壹億參萬伍仟肆佰貳拾肆")
  }
  test(" 136161 => 壹億參萬陸仟壹佰陸拾壹 ") {
    assert(format(136161) == "壹億參萬陸仟壹佰陸拾壹")
  }
  test(" 136900 => 壹億參萬陸仟玖佰 ") {
    assert(format(136900) == "壹億參萬陸仟玖佰")
  }
  test(" 137641 => 壹億參萬柒仟陸佰肆拾壹 ") {
    assert(format(137641) == "壹億參萬柒仟陸佰肆拾壹")
  }
  test(" 138384 => 壹億參萬捌仟參佰捌拾肆 ") {
    assert(format(138384) == "壹億參萬捌仟參佰捌拾肆")
  }
  test(" 139129 => 壹億參萬玖仟壹佰貳拾玖 ") {
    assert(format(139129) == "壹億參萬玖仟壹佰貳拾玖")
  }
  test(" 139876 => 壹億參萬玖仟捌佰柒拾陸 ") {
    assert(format(139876) == "壹億參萬玖仟捌佰柒拾陸")
  }
  test(" 140625 => 壹億肆萬陸佰貳拾伍 ") {
    assert(format(140625) == "壹億肆萬陸佰貳拾伍")
  }
  test(" 141376 => 壹億肆萬壹仟參佰柒拾陸 ") {
    assert(format(141376) == "壹億肆萬壹仟參佰柒拾陸")
  }
  test(" 142129 => 壹億肆萬貳仟壹佰貳拾玖 ") {
    assert(format(142129) == "壹億肆萬貳仟壹佰貳拾玖")
  }
  test(" 142884 => 壹億肆萬貳仟捌佰捌拾肆 ") {
    assert(format(142884) == "壹億肆萬貳仟捌佰捌拾肆")
  }
  test(" 143641 => 壹億肆萬參仟陸佰肆拾壹 ") {
    assert(format(143641) == "壹億肆萬參仟陸佰肆拾壹")
  }
  test(" 144400 => 壹億肆萬肆仟肆佰 ") {
    assert(format(144400) == "壹億肆萬肆仟肆佰")
  }
  test(" 145161 => 壹億肆萬伍仟壹佰陸拾壹 ") {
    assert(format(145161) == "壹億肆萬伍仟壹佰陸拾壹")
  }
  test(" 145924 => 壹億肆萬伍仟玖佰貳拾肆 ") {
    assert(format(145924) == "壹億肆萬伍仟玖佰貳拾肆")
  }
  test(" 146689 => 壹億肆萬陸仟陸佰捌拾玖 ") {
    assert(format(146689) == "壹億肆萬陸仟陸佰捌拾玖")
  }
  test(" 147456 => 壹億肆萬柒仟肆佰伍拾陸 ") {
    assert(format(147456) == "壹億肆萬柒仟肆佰伍拾陸")
  }
  test(" 148225 => 壹億肆萬捌仟貳佰貳拾伍 ") {
    assert(format(148225) == "壹億肆萬捌仟貳佰貳拾伍")
  }
  test(" 148996 => 壹億肆萬捌仟玖佰玖拾陸 ") {
    assert(format(148996) == "壹億肆萬捌仟玖佰玖拾陸")
  }
  test(" 149769 => 壹億肆萬玖仟柒佰陸拾玖 ") {
    assert(format(149769) == "壹億肆萬玖仟柒佰陸拾玖")
  }
  test(" 150544 => 壹億伍萬伍佰肆拾肆 ") {
    assert(format(150544) == "壹億伍萬伍佰肆拾肆")
  }
  test(" 151321 => 壹億伍萬壹仟參佰貳拾壹 ") {
    assert(format(151321) == "壹億伍萬壹仟參佰貳拾壹")
  }
  test(" 152100 => 壹億伍萬貳仟壹佰 ") {
    assert(format(152100) == "壹億伍萬貳仟壹佰")
  }
  test(" 152881 => 壹億伍萬貳仟捌佰捌拾壹 ") {
    assert(format(152881) == "壹億伍萬貳仟捌佰捌拾壹")
  }
  test(" 153664 => 壹億伍萬參仟陸佰陸拾肆 ") {
    assert(format(153664) == "壹億伍萬參仟陸佰陸拾肆")
  }
  test(" 154449 => 壹億伍萬肆仟肆佰肆拾玖 ") {
    assert(format(154449) == "壹億伍萬肆仟肆佰肆拾玖")
  }
  test(" 155236 => 壹億伍萬伍仟貳佰參拾陸 ") {
    assert(format(155236) == "壹億伍萬伍仟貳佰參拾陸")
  }
  test(" 156025 => 壹億伍萬陸仟貳拾伍 ") {
    assert(format(156025) == "壹億伍萬陸仟貳拾伍")
  }
  test(" 156816 => 壹億伍萬陸仟捌佰壹拾陸 ") {
    assert(format(156816) == "壹億伍萬陸仟捌佰壹拾陸")
  }
  test(" 157609 => 壹億伍萬柒仟陸佰玖 ") {
    assert(format(157609) == "壹億伍萬柒仟陸佰玖")
  }
  test(" 158404 => 壹億伍萬捌仟肆佰肆 ") {
    assert(format(158404) == "壹億伍萬捌仟肆佰肆")
  }
  test(" 159201 => 壹億伍萬玖仟貳佰壹 ") {
    assert(format(159201) == "壹億伍萬玖仟貳佰壹")
  }
  test(" 160000 => 壹億陸萬 ") {
    assert(format(160000) == "壹億陸萬")
  }
  test(" 160801 => 壹億陸萬捌佰壹 ") {
    assert(format(160801) == "壹億陸萬捌佰壹")
  }

  test(" 1 => 壹 ") {
    assert(format(1) == "壹")
  }
  test(" 2 => 貳 ") {
    assert(format(2) == "貳")
  }
  test(" 3 => 參 ") {
    assert(format(3) == "參")
  }
  test(" 4 => 肆 ") {
    assert(format(4) == "肆")
  }
  test(" 5 => 伍 ") {
    assert(format(5) == "伍")
  }
  test(" 6 => 陸 ") {
    assert(format(6) == "陸")
  }
  test(" 7 => 柒 ") {
    assert(format(7) == "柒")
  }
  test(" 8 => 捌 ") {
    assert(format(8) == "捌")
  }
  test(" 9 => 玖 ") {
    assert(format(9) == "玖")
  }
  test(" 10 => 壹拾 ") {
    assert(format(10) == "壹拾")
  }
  test(" 11 => 壹拾壹 ") {
    assert(format(11) == "壹拾壹")
  }
  test(" 12 => 壹拾貳 ") {
    assert(format(12) == "壹拾貳")
  }
  test(" 13 => 壹拾參 ") {
    assert(format(13) == "壹拾參")
  }
  test(" 14 => 壹拾肆 ") {
    assert(format(14) == "壹拾肆")
  }
  test(" 15 => 壹拾伍 ") {
    assert(format(15) == "壹拾伍")
  }
  test(" 16 => 壹拾陸 ") {
    assert(format(16) == "壹拾陸")
  }
  test(" 17 => 壹拾柒 ") {
    assert(format(17) == "壹拾柒")
  }
  test(" 18 => 壹拾捌 ") {
    assert(format(18) == "壹拾捌")
  }
  test(" 19 => 壹拾玖 ") {
    assert(format(19) == "壹拾玖")
  }
  test(" 20 => 貳拾 ") {
    assert(format(20) == "貳拾")
  }
  test(" 21 => 貳拾壹 ") {
    assert(format(21) == "貳拾壹")
  }
  test(" 22 => 貳拾貳 ") {
    assert(format(22) == "貳拾貳")
  }
}
