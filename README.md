**Tag Content Extractor**

In a tag-based language like _XML_ or _HTML_, contents are enclosed between a _start tag_ and an _end tag_ like `<tag>contents</tag>`. Note that the corresponding _end tag_ starts with a `/`.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

1.  The name of the _start_ and _end_ tags must be same. The HTML code `<h1>Hello World</h2>` is _not valid_, because the text starts with an `h1` tag and ends with a non-matching `h2` tag.
    
2.  Tags can be nested, but content between nested tags is considered _not valid_. For example, in `<h1><a>contents</a>invalid</h1>`, `contents` is _valid_ but `invalid` is _not valid_.
    
3.  Tags can consist of any printable characters.

**Sample Input**
```
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
<h2>Please give me donuts for friday <span>snacks!</span></h2>

```

**Sample Output**

```
"Nayeem loves counseling"
"Sanjay has no watch So wait for a while"
""
"Imtiaz has a secret crush"
"snacks!"

```
