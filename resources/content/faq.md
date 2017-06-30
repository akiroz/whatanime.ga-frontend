
# FAQ

-------------------

### Search is not working!

Some anti-virus / internet security software such as kaspersky may have blocked the website. You need to whitelist the website.

### Cannot open the website!

Some browser does not support latest version of SSL/TLS, such as 360 Browser in China. Try another browser. Primary supported browsers are Chrome and Firefox.

### Why I can't find the search result?

Possible reasons:

* Your image is not an original anime screenshot.

  You may try to use [SauceNAO][] and [iqdb.org][] which is best for searching anime artwork.

* The anime has not been analyzed yet.

  New animes currently airing would be analyzed around 24 hours after TV broadcast. Long-running animes / cartoons are excluded at this stage. See "What animes are indexed" at the bottom of this page.

* Your image is flipped.

  If you image comes from AMV / Anime Compilations, it's likely its flipped horizontally. Use the flip button to search again.

* Your image is of bad quality.

  The image search algorithm is designed for almost-exact match, not similar match. It analyze the color layout of the image. So, when your image is not a full un-cropped original 16:9 screenshot (i.e. cropped image), the search would likely fail.
  Color is an important factor for the correct search, if heavy tints and filters are applied to the screenshot (i.e. grayscale, contrast, saturate, brightness, sepia), too much information are lost. In this case the search would also fail. The Edge Histogram can solve this issue by ignoring colors and only search edges. But I am running out of computing resource to support another image descriptor.
  Image transform is also an important factor. If the image is not scaled without maintaining original aspect ratios (i.e. elongated, flipped, rotated), the search would also fail.
  Text occupied too much of the image. Large texts on the image would interfere the original image. The system is not smart enough to ignore the text.
  If you image has too little distinguish features (e.g. dark images or images with large plain blocks of plain colors), the search would also fail.
  Searching with a real photo (of an anime) definitely won't work.

### How does it work?

It uses the MPEG 7 Color Layout Descriptor for comparing images. Wikipedia has a good illustration about it. This would also explain why you can't find your image. https://en.wikipedia.org/wiki/Color_layout_descriptor

### How to make the search for a more accurate result?

Crop your screenshot to 16:9 or 4:3 before searching. Remove any extra borders in screencap (if any). By default, it crops the image to 16:9, if you upload a 16:10 screenshot, it should be cropped automatically. If the position is incorrect, you can drag the image and adjust the crop position.

### What animes are being indexed?

Most japan anime since 2000 are indexed, plus some popular anime in 1990s, and little anime before 1990. A list of anime are incomplete in index at this stage, including Jewelpet, Yu-Gi-Oh!, Dragon Ball, Crayon Shin-chan, Doraemon, Pokemon, Detective Conan, Chibi Maruko-chan and old Hentai-anime.

### Why I can't preview the search result?

There is no preview for mobile devices. Some animes are being removed or relocated, so some of the previews are offline now. The preview uses a considerable amount of network bandwidth, it would takes time to load if you have a slow connection.

### Why the anime are chinese-subbed?

I am still collecting raw animes, and it would take a number of powerful servers several months to complete. It will switch to the new dataset once it is ready. The current dataset uses chinese-subbed anime because the current index is provided by some Asian users.

### How can I watch the entire anime?

This website is not intended for watching anime.
If you wish to watch the anime, you may check which TV channel is broadcasting the anime in you country. For those which has finished airing, consider buying or renting the original Blu-ray/DVDs.

### How can I share the search result?

For now, you have to upload the image somewhere else, then search by image URL, and share the result URL. If you have any feedback or suggestions, feel free to contact [help@whatanime.ga][].

### How to add whatanime.ga to Image Search Options

If you prefer to use whatanime.ga with [Image Search Options][], go to settings and add this:

```
https://whatanime.ga/?url=
```

You can also configure playback options via URL params:

```
https://whatanime.ga/?autoplay=0&loop&mute=1&url=
```

[SauceNAO]: https://saucenao.com/
[iqdb.org]: https://iqdb.org/
[help@whatanime.ga]: mailto:help@whatanime.ga
[Image Search Options]: https://chrome.google.com/webstore/detail/image-search-options/kljmejbpilkadikecejccebmccagifhl

