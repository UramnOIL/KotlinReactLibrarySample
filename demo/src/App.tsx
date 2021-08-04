import React, { useState } from "react";
import { useHoge, incrementValue } from "KotlinReactLibrarySample";

function App() {
  const hoge = useHoge();

  return (
    <div className="App">
      <h2>{hoge}</h2>
      <button
        onClick={() => {
          incrementValue();
        }}
      >
        Increment
      </button>
    </div>
  );
}

export default App;
