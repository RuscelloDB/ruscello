# 3: UI Framework

Date: 2018-05-28

## Status

Proposed

## Context

React
Angular
Vue

I dont know any of them
Client side app that will use REST API
node

ES6/ES2017/ES2018 vs TypeScript

## Decision

React with redux using Flux action objects (FSA) compliant actions.

### keymirror

A key mirror is an object where for each property, the key is the same as the value. 
They are most useful as a collection of constants that ‘give back’ their own definition, and many languages already provide an integrated solution for this behaviour in the form of an enum. Unfortunately, JavaScript doesn’t so we use ‘key mirrors’ instead.

1. Auto-completion: You want your IDE to auto-complete string literals that are common in your code. 
Introducing key mirrors for this purpose will help you avoid nasty typos that are otherwise inevitable, especially if you are working with a team of developers.

2. Time-saving and consolidation: You find yourself typing multiple string literals more than once, and they serve a common purpose.

3. Check for legality of a value: You want to easily check that a value is ‘legal’ by using that value as a key in the keyMirror.Auto-completion: You want your IDE to auto-complete string literals that are common in your code. 
Introducing key mirrors for this purpose will
help you avoid nasty typos that are otherwise inevitable, especially if you are working with a team of developers.

4. Track original key [(From Jordan, Pioneering Inventor of the keyMirror)](https://sdgluck.github.io/2015/08/12/key-mirrors/#comment-2196343745): don’t forget the benefit of being able to track the original key that was used to generate the value in logs or debugging. 
If COLOURS is a keyMirror, then the value tracks its original key name, whereas if it’s a mapping from keys to integers, you have to consult some far removed piece of code to recall what original concept that number was mapped from.


React Flow

Index - main entry point which has react-dom render. React redux provider is created in which we pass in a store. Redux router is used here with history (createBrowserHistory) and finally our App Component

App.js - App Component is the upper most component. Main UI structure here?

Store.js - Construct store here. Has a dependency on reduers. Do we need
to build a root reducer?

Routing - react router


## Consequences


