# ScaladocStaticDemo

## What is it?

A minimal example of static site creation with `scaladoc`.

An `sbt` configuration is given, and a few markdown files are placed in the right locations.

## What is it not?

A full-fledged demo of `scaladoc`, with all the bells and whistles.
In particular, there are no explanations of `scaladoc` tags, and no customizations of the default page layouts and styles.

## How to run

A simple
```
sbt doc
```
should do the trick.

## Output

Point a browser to:
```
target/scala-3.1.0/api/index.html
```

A generated output can be seen at: <https://charpov.github.io/ScaladocStaticDemo/>
