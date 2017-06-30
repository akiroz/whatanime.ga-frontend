
# Changelog

----------------------------

### Search changes
30 Apr 2017

You can now search scenes with any aspect ratio. Thumbnail preview also
respect aspect ratio now. Recaptcha is removed, you must wait up to
10 minutes once you have reached search quota limit (20 search per
10 minutes). Homepage code has been re-written, the webpage now loads
faster. And a new loading animation was added.

### Search for more results
23 Apr 2017

You can now keep searching the database for more results. Previously,
the search would stop when it has found any result > 90% similarity.
Now keep searching to discover more results with even higher similarity!

### Search in specific season
18 Apr 2017

You can now select a particular year / season to search. If you like
this project, feel free to [Support whatanime.ga on Patreon][18 Apr 2017 - 1].

[18 Apr 2017 - 1]: https://www.patreon.com/soruly

### System maintenance
15 Apr 2017

Server upgrade and cleanup was completed on 15 Apr 2017. An additional
hard drive and new network adapter has been installed.

### System status page
14 Apr 2017

You can now see the system status in https://status.whatanime.ga
(Powered by UptimeRobot).

### Partial service interruption
23 Feb 2017

Anime info panel was not showing since Feb 21 21:13 UTC, the service has
been restored on Feb 23 03:34 UTC.

### Image proxy relocated
21 Feb 2017

The image proxy server has been moved from Singapore (Digital Ocean) to
Tokyo (Linode). It may affect loading times of images from `?url=` params.

### Video preview for Telegram Bot
4 Feb 2017

The [Telegram Bot][4 Feb 2017 - 1] will now sends you a video preview.

[4 Feb 2017 - 1]: https://telegram.me/WhatAnimeBot

### Official API released
17 Jan 2017

The official API is now open for testing. Interested developers may read the
docs on [GitHub Pages][17 Jan 2017 - 1].

[17 Jan 2017 - 1]: https://soruly.github.io/whatanime.ga/

### WebExtension updated
16 Nov 2016

The image extraction method of WebExtension has changed. This would
be able to fix some issues on grabbing the correct image on webpage
to search. Now the extension also supports Microsoft Edge. You may
try loading the zip from [GitHub][16 Nov 2016 - 1] by enabling extension
developer features in `about:flags`.

[16 Nov 2016 - 1]: https://github.com/soruly/whatanime.ga-WebExtension/releases

### Enabled autoplay on mobile
11 Nov 2016

Now mobile devies will mute and autoplay the video preview.

### Added URL params for playback options
29 Oct 2016

You can now use URL params to control playback options, for example:

```
https://whatanime.ga/?autoplay=0&loop&mute=1&url=
```

### Improved performance
23 Oct 2016

Reduced search result candidates from 10 Million to 3 Million. This
would reduce accuracy but greatly improves performance.

### Added links to database dump
5 Oct 2016

You can now download a complete dump of the database.

### Added more server status
1 Oct 2016

You can see server load and recently indexed files in /about

### Adding Raw Anime
1 Oct 2016

The database has started indexing raw anime from now on.

### Added Telegram Bot
14 Sep 2016

This telegram bot can tell you where an anime screenshot is taken from.
Just send / forward an image to https://telegram.me/WhatAnimeBot .

### WebExtension Changes
14 Aug 2016

The `?auto` url param is no longer used. Now it would always automatically search.

WebExtension has updated. Now it would copy and paste using dataURL in
background. It allows searching images from pages that's not publicly available
such as Facebook Feeds. It also supports searching from HTML5 videos using the
frame extracted at the moment you click it. Now extensions no longer use the
`?url` to send search images.

### WebExtension for Chrome, Firefox and Opera
1 July 2016

[Chrome Extension][1 July 2016 - 1], [Firefox Add-on][1 July 2016 - 2],
[Opera Add-on][1 July 2016 - 3] has been relased. Source code available
on [GitHub][1 July 2016 - 4].

[1 July 2016 - 1]: https://chrome.google.com/webstore/detail/search-anime-by-screensho/gkamnldpllcbiidlfacaccdoadedncfp
[1 July 2016 - 2]: https://addons.mozilla.org/en-US/firefox/addon/search-anime-by-screenshot/
[1 July 2016 - 3]: https://addons.opera.com/en/extensions/details/search-anime-by-screenshot/
[1 July 2016 - 4]: https://github.com/soruly/whatanime.ga-WebExtension

### Improved anime title language
30 Jun 2016

It now shows anime titles according to users' browser language.

### Added loading icon
30 Jun 2016

It now shows a loading icon (instead of blurring) while searching.
Also display a loading icon when the video preview is loading.

### Added preview thumbnails
30 May 2016

The thumbnail may not be at the exact moment, since the seeking is not
very accurate. Play the preview to see if it's what you are looking for.

### Fixed some bugs in URL loading
6 May 2016

In case the image cannot be loaded, upload the image from file
or copy image itself (not URL) then Ctrl+V

### Speed up image load from URL
23 Apr 2016

Images load from URL would be compressed. This would speed up loading GIF
and large images from URL.

### Performance Tweaks
18 Apr 2016

Server will now cache some search results. Search results would be cached
for 5-30 minutes. The better the search results, the longer the results
would be cached.

### Updated Chrome Extension
8 Apr 2016

Once the image completes loading, it would search automatically. You can
change the setting in Chrome Extension. Also see how you can search in Firefox in FAQ.

### Added index cache status
7 Apr 2016

You can now see how much data is cached in RAM from About page. The higher the
percentage faster the search. It usually stays around 33% due to limited RAM.

### Incorrect timestamp issue identified
6 Apr 2016

There has been some incorrect timestamp in search results due to image analyze
scripts parsing outputs of ffmpeg incorrectly. The script has been updated now.
From now on new animes should have a correct timestamp, while it would take at
about two months to fix already indexed animes. The new script is also 33%
faster when indexing anime.

### Fixes some image editing issue
10 Mar 2016

Image would sometimes gone black when clicking fit / flip button. Now fixed.

### Added Fit Width / Height option
6 Mar 2016

You can now choose to Fit Width / Height for your search image.
Also fixed some flickering issue on previews.

### Fixed some Image URL issue
3 Mar 2016

Fixed some cross-site image URL linking issue. Most image URL should load now.

### New Anime Info Panel UI
1 Mar 2016

A better layout for more Anime information.

### Added Image URL Option
1 Mar 2016

You can now search by Image URL

### Added Safe Search Option
28 Feb 2016

The Safe Search Option can hide most Hentai Anime from search result.
But you should aware that some regular season Animes can still be obscene. (NSFW)

### Try the Chrome Extension
28 Feb 2016

Now you can use the Chrome Extension to search.

### Added some Hentai Anime
28 Feb 2016

About 168 Heitai Anime series has been added.

### Added sample screenshot in FAQ
28 Feb 2016

To help users to understand how the search engine works, we have added
some good and bad screenshots in FAQ.

### Performance Improvement
21 Feb 2016

Improved caching method to warmup cold data.

### More fixes
20 Feb 2016

Database has been cleaned up and reloaded. This should fix most video previews.
Fixed some anime titles still being null.

### Bug Fix
17 Feb 2016

Fixed the empty search result. The issue has been resolved. A large number
of files has been relocated, video preview may be missing for some search results.

### Improved Performance
01 Jan 2016

Increased cache size to improve performance when the server has been idle
for a long time.

### Added a Flip Button
31 Dec 2015

You may now flip the image before searching. If you can't find a match,
try to flip your image and search again. (Especially useful for AMV)

### Search Algorithm Changed
21 Dec 2015

Switched to use a new searching algorithm. The search is slower but more accurate.

### Public Beta
19 Dec 2015

Adding some informative pages.

