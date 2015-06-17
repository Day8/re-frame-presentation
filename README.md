# re-frame-presentation

A [re-frame](https://github.com/Day8/re-frame) application and reveal.js presentation on re-frame 
(talk about dogfooding)

It has a reveal.js presentation and 3 live examples in reagent and re-frame

## Development Mode

```
lein clean
lein figwheel
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

## Production Build

```
lein clean
lein cljsbuild once min
```
